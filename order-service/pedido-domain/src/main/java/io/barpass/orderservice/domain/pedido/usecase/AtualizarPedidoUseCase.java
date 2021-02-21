package io.barpass.orderservice.domain.pedido.usecase;

import io.barpass.commons.domain.usecase.UpdateUseCase;
import io.barpass.orderservice.domain.pedido.entity.Pedido;

import java.util.UUID;

public interface AtualizarPedidoUseCase extends UpdateUseCase<Pedido, UUID> {

}
