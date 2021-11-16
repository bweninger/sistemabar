package io.barpass.orderservice.application.dataprovider;

import io.barpass.commons.domain.dataprovider.AbstractDataProviderImpl;
import io.barpass.orderservice.application.mapper.ComandaEntityMapper;
import io.barpass.orderservice.application.repository.ComandaRepository;
import io.barpass.orderservice.application.repository.entity.ComandaEntity;
import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.TipoComanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

@Component
public class ComandaDataProviderImpl extends AbstractDataProviderImpl<Comanda, ComandaEntity, UUID> implements ComandaDataProvider {

    private final ComandaRepository comandaRepository;

    @Autowired
    public ComandaDataProviderImpl(ComandaRepository comandaRepository, ComandaEntityMapper comandaEntityMapper) {
        super(comandaRepository, comandaEntityMapper);
        this.comandaRepository = comandaRepository;
    }

    public Collection<Comanda> listByIdUsuarioVigente(UUID idUsuario) {
        return this.comandaRepository.listByUsuarioVigente(idUsuario).stream().collect(this.mappingCollector);
    }

    @Override
    public Collection<Comanda> listByUsuarioNumeroVigenciaAndTipo(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia, TipoComanda tipoComanda) {
        return this.comandaRepository.listByUsuarioNumeroVigenciaAndTipo(idUsuario, numeroComanda, dataVigencia, tipoComanda.name()).
                stream().collect(this.mappingCollector);
    }

}
