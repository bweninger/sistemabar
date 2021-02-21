package io.barpass.orderservice.domain.comanda.dataprovider;

import io.barpass.commons.domain.dataprovider.DataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;

import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

public interface ComandaDataProvider extends DataProvider<Comanda> {

    default Collection<Comanda> listByIdUsuarioVigente(UUID idUsuario) {
        return this.listByUsuarioAndVigencia(idUsuario, Instant.now());
    }

    Collection<Comanda> listByUsuarioAndVigencia(UUID idUsuario, Instant dataVigencia);

}
