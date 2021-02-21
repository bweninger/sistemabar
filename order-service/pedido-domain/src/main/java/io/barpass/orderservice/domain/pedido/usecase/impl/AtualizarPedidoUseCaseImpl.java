package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.AtualizarPedidoUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

@Named
public class AtualizarPedidoUseCaseImpl implements AtualizarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Inject
    public AtualizarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public void validate(Pedido pedido) {
        if (pedido.getItens().stream().anyMatch(item -> item.getQuantidade() < 1)) {
            throw new IllegalArgumentException("Quantidade do item pedido nao pode ser inferior a um.");
        }
    }

    @Override
    public Pedido doUpdate(UUID uuid, Pedido pedido) {
        return this.pedidoDataProvider.update(uuid, pedido);
    }
}
