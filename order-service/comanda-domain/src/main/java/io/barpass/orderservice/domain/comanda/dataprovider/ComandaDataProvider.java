package io.barpass.orderservice.domain.comanda.dataprovider;

import io.barpass.commons.domain.dataprovider.DataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.TipoComanda;

import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

public interface ComandaDataProvider extends DataProvider<Comanda, UUID> {

    default Collection<Comanda> listByIdUsuarioVigente(UUID idUsuario) {
        return this.listByUsuarioNumeroAndVigencia(idUsuario, null, Instant.now());
    }

    default Collection<Comanda> listByNumeroVigente(Long numeroComanda) {
        return this.listByUsuarioNumeroVigenciaAndTipo(null, numeroComanda, Instant.now(), TipoComanda.FISICA);
    }

    default Collection<Comanda> listByUsuarioNumeroAndVigencia(UUID idUsuario, Long numeroComanda, Instant dataVigencia) {
        return this.listByUsuarioNumeroVigenciaAndTipo(idUsuario, numeroComanda, dataVigencia, null);
    }

    Collection<Comanda> listByUsuarioNumeroVigenciaAndTipo(UUID idUsuario, Long numeroComanda, Instant dataVigencia, TipoComanda tipoComanda);

}
