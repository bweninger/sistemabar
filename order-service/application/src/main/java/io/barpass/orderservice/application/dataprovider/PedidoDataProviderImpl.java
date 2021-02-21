package io.barpass.orderservice.application.dataprovider;

import io.barpass.commons.domain.dataprovider.impl.AbstractDataProviderImpl;
import io.barpass.orderservice.domain.pedido.dataprovider.PedidoDataProvider;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import org.springframework.stereotype.Component;

@Component
public class PedidoDataProviderImpl extends AbstractDataProviderImpl<Pedido> implements PedidoDataProvider {

}
