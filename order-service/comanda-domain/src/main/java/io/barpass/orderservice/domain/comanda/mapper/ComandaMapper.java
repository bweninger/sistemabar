package io.barpass.orderservice.domain.comanda.mapper;

import io.barpass.commons.domain.mapper.MapperWithOptional;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComandaMapper extends MapperWithOptional {

    ComandaVO toValueObject(Comanda comanda);
}
