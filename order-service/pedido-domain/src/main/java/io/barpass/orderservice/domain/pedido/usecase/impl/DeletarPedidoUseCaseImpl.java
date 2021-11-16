package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.usecase.DeletarPedidoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class DeletarPedidoUseCaseImpl implements DeletarPedidoUseCase {

    private PedidoDataProvider pedidoDataProvider;

    @Autowired
    public DeletarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
        this.pedidoDataProvider = pedidoDataProvider;
    }

    @Override
    public void validate(UUID primaryKey) {
        if (Objects.isNull(primaryKey)) {
            throw new IllegalArgumentException("Id do Pedido nao pode ser nulo.");
        }
    }

    @Override
    public void doDelete(UUID primaryKey) {
        this.pedidoDataProvider.delete(primaryKey);
    }

}
