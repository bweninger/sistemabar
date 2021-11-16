package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.ListarPedidosUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

@Component
public class ListarPedidosUseCaseImpl implements ListarPedidosUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Autowired
    public ListarPedidosUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public Collection<Pedido> list() {
        return this.pedidoDataProvider.getAll();
    }

    @Override
    public Collection<Pedido> listByIdComanda(UUID idComanda) {
        if (Objects.isNull(idComanda)) {
            return list();
        } else {
            return this.pedidoDataProvider.listByIdComanda(idComanda);
        }
    }
}
