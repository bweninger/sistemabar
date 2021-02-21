package io.barpass.orderservice.domain.pedido.usecase;

import io.barpass.commons.domain.usecase.ReadUseCase;
import io.barpass.orderservice.domain.pedido.entity.Pedido;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public interface BuscarPedidoUseCase extends ReadUseCase<Pedido, UUID> {

    Optional<Pedido> getByUserAndDate(UUID idUsuario, Instant date);
}
