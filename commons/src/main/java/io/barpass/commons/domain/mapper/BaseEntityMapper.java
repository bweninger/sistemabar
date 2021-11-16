package io.barpass.commons.domain.mapper;

public interface BaseEntityMapper<JPA, DOMAIN> extends MapperWithOptional {

    JPA toJpaEntity(DOMAIN domain);

    DOMAIN fromJpaEntity(JPA jpa);
}
