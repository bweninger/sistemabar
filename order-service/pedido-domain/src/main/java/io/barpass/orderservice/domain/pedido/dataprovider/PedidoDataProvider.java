package io.barpass.orderservice.domain.pedido.dataprovider;

import io.barpass.commons.domain.dataprovider.DataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoDataProvider extends DataProvider<Pedido, UUID> {

    List<Pedido> listByIdComanda(UUID idComanda);
}
