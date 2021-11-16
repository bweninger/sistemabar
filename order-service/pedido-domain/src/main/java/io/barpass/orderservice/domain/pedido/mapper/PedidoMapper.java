package io.barpass.orderservice.domain.pedido.mapper;

import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.vo.PedidoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

    PedidoVO toValueObject(Pedido pedido);
}
