package io.barpass.orderservice.domain.comanda.usecase;

import io.barpass.commons.domain.usecase.ListUseCase;
import io.barpass.orderservice.domain.comanda.entity.Comanda;

import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

public interface ListarComandasUseCase extends ListUseCase<Comanda> {

    Collection<Comanda> listByIdUsuarioAndVigencia(UUID idUsuario, Instant dataVigencia);
}
