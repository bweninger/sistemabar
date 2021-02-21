package io.barpass.orderservice.domain.pedido.usecase;

import io.barpass.commons.domain.usecase.ListUseCase;
import io.barpass.orderservice.domain.pedido.entity.Pedido;

import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

public interface ListarPedidosUseCase extends ListUseCase<Pedido> {

    Collection<Pedido> listByIdComanda(UUID idComanda);

}
