package io.barpass.orderservice.application.mapper;

import io.barpass.orderservice.application.model.AtualizarItemPedidoRequest;
import io.barpass.orderservice.application.model.CriarItemPedidoRequest;
import io.barpass.orderservice.application.model.ItemPedidoResponse;
import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemPedidoVOMapper {

    ItemPedidoVO fromUpdateRequest(AtualizarItemPedidoRequest request);

    ItemPedidoVO fromCreateRequest(CriarItemPedidoRequest request);

    ItemPedidoResponse toResponse (ItemPedidoVO vo);
}
