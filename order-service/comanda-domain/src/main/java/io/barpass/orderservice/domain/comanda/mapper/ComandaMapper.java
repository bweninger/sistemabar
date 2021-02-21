package io.barpass.orderservice.domain.comanda.mapper;

import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ComandaMapper {


    @Mapping(source = "comandaPK.id", target = "id")
    @Mapping(source = "comandaPK.dataInicioVigencia", target = "dataInicioVigencia")
    ComandaVO toValueObject(Comanda comanda);
}
