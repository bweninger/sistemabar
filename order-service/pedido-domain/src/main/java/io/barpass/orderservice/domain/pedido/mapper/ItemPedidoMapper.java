package io.barpass.orderservice.domain.pedido.mapper;

import io.barpass.orderservice.domain.pedido.entity.ItemPedido;
import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemPedidoMapper {

    ItemPedido fromValueObject(ItemPedidoVO itemPedidoVO);
}
