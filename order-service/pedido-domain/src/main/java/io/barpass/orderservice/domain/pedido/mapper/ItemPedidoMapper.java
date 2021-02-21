package io.barpass.orderservice.domain.pedido.mapper;

import io.barpass.orderservice.domain.pedido.entity.ItemPedido;
import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;

public interface ItemPedidoMapper {

    ItemPedido fromValueObject(ItemPedidoVO itemPedidoVO);
}
