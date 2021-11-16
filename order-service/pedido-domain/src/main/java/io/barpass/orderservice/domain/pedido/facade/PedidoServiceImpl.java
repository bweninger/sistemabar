package io.barpass.orderservice.domain.pedido.facade;

import io.barpass.orderservice.domain.pedido.command.AtualizarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.CriarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.DeletarPedidoCommand;
import io.barpass.orderservice.domain.pedido.entity.Pedido;
import io.barpass.orderservice.domain.pedido.entity.StatusPedido;
import io.barpass.orderservice.domain.pedido.mapper.ItemPedidoMapper;
import io.barpass.orderservice.domain.pedido.mapper.PedidoMapper;
import io.barpass.orderservice.domain.pedido.usecase.*;
import io.barpass.orderservice.domain.pedido.vo.PedidoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class PedidoServiceImpl implements PedidoService {

    private final CriarPedidoUseCase criarPedidoUseCase;

    private final AtualizarPedidoUseCase atualizarPedidoUseCase;

    private final DeletarPedidoUseCase deletarPedidoUseCase;

    private final BuscarPedidoUseCase buscarPedidoUseCase;

    private final ListarPedidosUseCase listarPedidosUseCase;

    private final PedidoMapper pedidoMapper;

    private final ItemPedidoMapper itemPedidoMapper;

    @Autowired
    public PedidoServiceImpl(CriarPedidoUseCase criarPedidoUseCase, AtualizarPedidoUseCase atualizarPedidoUseCase,
                             DeletarPedidoUseCase deletarPedidoUseCase, BuscarPedidoUseCase buscarPedidoUseCase,
                             ListarPedidosUseCase listarPedidosUseCase, PedidoMapper pedidoMapper, ItemPedidoMapper itemPedidoMapper) {
        this.criarPedidoUseCase = criarPedidoUseCase;
        this.atualizarPedidoUseCase = atualizarPedidoUseCase;
        this.deletarPedidoUseCase = deletarPedidoUseCase;
        this.buscarPedidoUseCase = buscarPedidoUseCase;
        this.listarPedidosUseCase = listarPedidosUseCase;
        this.pedidoMapper = pedidoMapper;
        this.itemPedidoMapper = itemPedidoMapper;
    }

    @Override
    public PedidoVO create(CriarPedidoCommand command) {
        var pedido = new Pedido();
        pedido.setIdComanda(command.getIdComanda());
        pedido.setStatus(StatusPedido.PENDENTE);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setItens(command.getItens().stream().map(this.itemPedidoMapper::fromValueObject).collect(Collectors.toList()));
        var pedidoCriado = this.criarPedidoUseCase.create(pedido);
        return this.pedidoMapper.toValueObject(pedidoCriado);
    }

    @Override
    public PedidoVO update(AtualizarPedidoCommand command) {
        var pedido = this.buscarPedidoUseCase.read(command.getIdPedido()).orElseThrow(IllegalArgumentException::new);
        pedido.setItens(command.getItens().stream().map(this.itemPedidoMapper::fromValueObject).collect(Collectors.toList()));
        pedido.setStatus(StatusPedido.valueOf(command.getStatus()));
        var pedidoAtualizado = this.atualizarPedidoUseCase.update(command.getIdPedido(), pedido);
        return this.pedidoMapper.toValueObject(pedidoAtualizado);
    }

    @Override
    public void delete(DeletarPedidoCommand command) {
        this.deletarPedidoUseCase.delete(command.getIdPedido());
    }

    @Override
    public PedidoVO get(UUID pedidoId) {
        var pedido = this.buscarPedidoUseCase.read(pedidoId).orElseThrow(IllegalArgumentException::new);
        return this.pedidoMapper.toValueObject(pedido);
    }

    @Override
    public List<PedidoVO> list(UUID idComanda) {
        return this.listarPedidosUseCase.listByIdComanda(idComanda).stream().
                map(this.pedidoMapper::toValueObject).collect(Collectors.toList());
    }

}
