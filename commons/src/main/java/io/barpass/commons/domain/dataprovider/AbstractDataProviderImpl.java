package io.barpass.commons.domain.dataprovider;

import io.barpass.commons.domain.exception.NotFoundException;
import io.barpass.commons.domain.mapper.BaseEntityMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class AbstractDataProviderImpl<ENTITY, JPA extends WithId<PK>, PK> implements DataProvider<ENTITY, PK> {

    protected Collector<JPA, List<JPA>, List<ENTITY>> mappingCollector = new Collector<>() {
        @Override
        public Supplier<List<JPA>> supplier() {
            return ArrayList::new;
        }

        @Override
        public BiConsumer<List<JPA>, JPA> accumulator() {
            return List::add;
        }

        @Override
        public BinaryOperator<List<JPA>> combiner() {
            return (l1, l2) -> {
                l1.addAll(l2);
                return l1;
            };
        }

        @Override
        public Function<List<JPA>, List<ENTITY>> finisher() {
            return (l1) -> l1.stream().map(mapper::fromJpaEntity).collect(Collectors.toList());
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED);
        }
    };

    protected JpaRepository<JPA, PK> jpaRepository;

    protected BaseEntityMapper<JPA, ENTITY> mapper;

    protected AbstractDataProviderImpl(JpaRepository<JPA, PK> jpaRepository, BaseEntityMapper<JPA, ENTITY> mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public ENTITY update(PK id, ENTITY comanda) {
        Optional<JPA> maybeComanda = this.jpaRepository.findById(id);
        maybeComanda.ifPresent(comandaEntity -> {
            var toUpdate = this.mapper.toJpaEntity(comanda);
            toUpdate.setId(comandaEntity.getId());
            this.jpaRepository.save(toUpdate);
        });
        return maybeComanda.map(this.mapper::fromJpaEntity).orElse(comanda);
    }

    @Override
    public void delete(PK id) {
        this.jpaRepository.deleteById(id);
    }

    @Override
    public ENTITY get(PK id) {
        Optional<JPA> jpa = this.jpaRepository.findById(id);
        return jpa.map(this.mapper::fromJpaEntity).orElseThrow(() -> new NotFoundException("Cannot find entity with id %d", id));
    }

    @Override
    public Collection<ENTITY> getAll() {
        return this.jpaRepository.findAll().stream().collect(mappingCollector);
    }

    @Override
    public ENTITY create(ENTITY entity) {
        return this.mapper.fromJpaEntity(this.jpaRepository.save(this.mapper.toJpaEntity(entity)));
    }
}
