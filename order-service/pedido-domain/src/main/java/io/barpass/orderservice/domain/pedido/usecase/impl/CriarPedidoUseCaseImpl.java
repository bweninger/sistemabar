package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.CriarPedidoUseCase;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CriarPedidoUseCaseImpl implements CriarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Inject
    public CriarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public void validate(Pedido request) {
        if (request.getItens().stream().anyMatch(item -> item.getQuantidade() < 1)) {
            throw new IllegalArgumentException("Quantidade do item pedido nao pode ser inferior a um.");
        }
    }

    @Override
    public Pedido doCreate(Pedido request) {
        return this.pedidoDataProvider.create(request);
    }
}
