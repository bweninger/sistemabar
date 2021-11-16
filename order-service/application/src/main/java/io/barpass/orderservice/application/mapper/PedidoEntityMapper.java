package io.barpass.orderservice.application.mapper;

import io.barpass.commons.domain.mapper.BaseEntityMapper;
import io.barpass.orderservice.application.repository.entity.PedidoEntity;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoEntityMapper extends BaseEntityMapper<PedidoEntity, Pedido> {

}
