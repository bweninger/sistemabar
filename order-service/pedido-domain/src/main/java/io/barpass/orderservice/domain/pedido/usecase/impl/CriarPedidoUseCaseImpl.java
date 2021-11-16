package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.CriarPedidoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CriarPedidoUseCaseImpl implements CriarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Autowired
    public CriarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public void validate(Pedido request) {

        if (request.getItens() != null && request.getItens().stream().anyMatch(item -> item.getQuantidade() < 1)) {
            throw new IllegalArgumentException("Quantidade do item pedido nao pode ser inferior a um.");
        }
    }

    @Override
    public Pedido doCreate(Pedido request) {
        return this.pedidoDataProvider.create(request);
    }
}
