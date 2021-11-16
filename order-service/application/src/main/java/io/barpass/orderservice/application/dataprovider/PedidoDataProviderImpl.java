package io.barpass.orderservice.application.dataprovider;

import io.barpass.commons.domain.dataprovider.AbstractDataProviderImpl;
import io.barpass.orderservice.application.mapper.PedidoEntityMapper;
import io.barpass.orderservice.application.repository.PedidoRepository;
import io.barpass.orderservice.application.repository.entity.PedidoEntity;
import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class PedidoDataProviderImpl extends
        AbstractDataProviderImpl<Pedido, PedidoEntity, UUID> implements PedidoDataProvider {

    private PedidoRepository pedidoRepository;

    public PedidoDataProviderImpl(PedidoRepository pedidoRepository, PedidoEntityMapper pedidoEntityMapper) {
        super(pedidoRepository, pedidoEntityMapper);
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> listByIdComanda(UUID idComanda) {
        return this.pedidoRepository.findAllByComanda_Id(idComanda).stream().collect(this.mappingCollector);
    }
}
