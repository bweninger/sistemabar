package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.BuscarPedidoUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Named
public class BuscarPedidoUseCaseImpl implements BuscarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Inject
    public BuscarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public Optional<Pedido> getByUserAndDate(UUID idUsuario, Instant date) {
        return Optional.empty();
    }

    @Override
    public Pedido read(UUID uuid) {
        if (Objects.isNull(uuid)) {
            throw new IllegalArgumentException("Id da Pedido e Data de Inicio de Vigencia sao obrigatorios para buscar uma comnada.");
        }

        return this.pedidoDataProvider.get(uuid);
    }
}
