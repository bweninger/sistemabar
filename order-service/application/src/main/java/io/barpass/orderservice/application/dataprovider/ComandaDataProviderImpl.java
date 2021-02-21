package io.barpass.orderservice.application.dataprovider;

import io.barpass.commons.domain.dataprovider.impl.AbstractDataProviderImpl;
import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

@Component
public class ComandaDataProviderImpl extends AbstractDataProviderImpl<Comanda> implements ComandaDataProvider {

    @Override
    public Collection<Comanda> listByIdUsuarioVigente(UUID idUsuario) {
        return null;
    }

    @Override
    public Collection<Comanda> listByUsuarioAndVigencia(UUID idUsuario, Instant dataVigencia) {
        return null;
    }
}
