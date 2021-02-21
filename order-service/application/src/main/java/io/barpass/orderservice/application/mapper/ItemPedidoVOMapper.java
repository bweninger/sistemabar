package io.barpass.orderservice.application.mapper;

import io.barpass.orderservice.application.model.CriarItemPedidoRequest;
import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;
import org.mapstruct.Mapper;

@Mapper
public interface ItemPedidoVOMapper {

    ItemPedidoVO fromRequest(CriarItemPedidoRequest request);
}
