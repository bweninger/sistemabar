package io.barpass.orderservice.domain.pedido.facade;

import io.barpass.orderservice.domain.pedido.command.AtualizarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.CriarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.DeletarPedidoCommand;
import io.barpass.orderservice.domain.pedido.vo.PedidoVO;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface PedidoService {

    PedidoVO create(CriarPedidoCommand command);

    PedidoVO update(AtualizarPedidoCommand command);

    void delete(DeletarPedidoCommand command);

    PedidoVO get(UUID pedidoId);

    List<PedidoVO> list(UUID idComanda);
}
