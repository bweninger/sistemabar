package io.barpass.orderservice.application.mapper;

import io.barpass.commons.domain.mapper.BaseEntityMapper;
import io.barpass.orderservice.application.repository.entity.ComandaEntity;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComandaEntityMapper extends BaseEntityMapper<ComandaEntity, Comanda> {

}
