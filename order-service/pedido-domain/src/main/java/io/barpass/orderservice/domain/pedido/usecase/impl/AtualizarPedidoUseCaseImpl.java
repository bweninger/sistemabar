package io.barpass.orderservice.domain.pedido.usecase.impl;

import io.barpass.commons.domain.usecase.impl.AbstractUpdateUseCaseImpl;
import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.usecase.AtualizarPedidoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AtualizarPedidoUseCaseImpl extends AbstractUpdateUseCaseImpl<Pedido, UUID> implements AtualizarPedidoUseCase {

    @Autowired
    public AtualizarPedidoUseCaseImpl(PedidoDataProvider pedidoDataProvider) {
       super(pedidoDataProvider);
    }

    @Override
    public void validate(Pedido old, Pedido pedido) {
        if (pedido.getItens().stream().anyMatch(item -> item.getQuantidade() < 1)) {
            throw new IllegalArgumentException("Quantidade do item pedido nao pode ser inferior a um.");
        }
    }
}
