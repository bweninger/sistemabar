package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.BuscarPedidoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Component
public class BuscarPedidoUseCaseImpl implements BuscarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Autowired
    public BuscarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public Optional<Pedido> getByUserAndDate(UUID idUsuario, Instant date) {
        return Optional.empty();
    }

    @Override
    public Optional<Pedido> read(UUID uuid) {
        if (Objects.isNull(uuid)) {
            throw new IllegalArgumentException("Id do Pedido obrigatorio para efetuar busca.");
        }

        return Optional.ofNullable(this.pedidoDataProvider.get(uuid));
    }
}
