package io.barpass.orderservice.domain.comanda.dataprovider;

import io.barpass.commons.domain.dataprovider.DataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.TipoComanda;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface ComandaDataProvider extends DataProvider<Comanda, UUID> {

    default Collection<Comanda> listByIdUsuarioVigente(UUID idUsuario) {
        return this.listByUsuarioNumeroAndVigencia(idUsuario, null, LocalDateTime.now());
    }

    default Optional<Comanda> getByNumeroAndVigencia(Long numeroComanda, LocalDateTime dataVigencia) {
        return this.listByUsuarioNumeroAndVigencia(null, numeroComanda, dataVigencia).stream().findFirst();
    }

    default Collection<Comanda> listByNumeroVigente(Long numeroComanda) {
        return this.listByUsuarioNumeroVigenciaAndTipo(null, numeroComanda, LocalDateTime.now(), TipoComanda.FISICA);
    }

    default Collection<Comanda> listByUsuarioNumeroAndVigencia(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia) {
        return this.listByUsuarioNumeroVigenciaAndTipo(idUsuario, numeroComanda, dataVigencia, null);
    }

    Collection<Comanda> listByUsuarioNumeroVigenciaAndTipo(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia, TipoComanda tipoComanda);

}
