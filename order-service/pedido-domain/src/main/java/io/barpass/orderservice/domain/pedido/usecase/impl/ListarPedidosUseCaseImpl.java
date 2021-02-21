package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.ListarPedidosUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
public class ListarPedidosUseCaseImpl implements ListarPedidosUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Inject
    public ListarPedidosUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public Collection<Pedido> list() {
        return this.pedidoDataProvider.getAll();
    }

}
