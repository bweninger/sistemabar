package io.barpass.orderservice.application.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.barpass.orderservice.application.mapper.ItemPedidoVOMapper;
import io.barpass.orderservice.application.model.*;
import io.barpass.orderservice.domain.pedido.command.AtualizarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.CriarPedidoCommand;
import io.barpass.orderservice.domain.pedido.command.DeletarPedidoCommand;
import io.barpass.orderservice.domain.pedido.facade.PedidoService;
import io.barpass.orderservice.domain.pedido.vo.PedidoVO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.UUID;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
@Controller
public class PedidosApiController implements PedidosApi {

    private static final Logger log = LoggerFactory.getLogger(PedidosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final PedidoService pedidoService;

    private final ItemPedidoVOMapper itemPedidoVOMapper;

    @org.springframework.beans.factory.annotation.Autowired
    public PedidosApiController(ObjectMapper objectMapper, HttpServletRequest request, PedidoService pedidoService, ItemPedidoVOMapper itemPedidoVOMapper) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.pedidoService = pedidoService;
        this.itemPedidoVOMapper = itemPedidoVOMapper;
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoResponse criarPedido(@ApiParam(value = "", required = true) @Valid @RequestBody CriarPedidoRequest criarPedidoRequest) {
        var builder = CriarPedidoCommand.CriarPedidoCommandBuilder.builder();
        var command = builder.withIdComanda(criarPedidoRequest.getIdComanda())
                .withItens(criarPedidoRequest.getItemPedidos().stream().map(this.itemPedidoVOMapper::fromCreateRequest).collect(Collectors.toList())).build();

        var pedidoVO = this.pedidoService.create(command);
        return parseResponse(pedidoVO);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PedidoResponse atualizarPedido(@ApiParam(value = "id do pedido", required = true) @PathVariable("idPedido") UUID idPedido, @ApiParam(value = "", required = true) @Valid @RequestBody AtualizarPedidoRequest atualizarPedidoRequest) {
        var builder = AtualizarPedidoCommand.AtualizarPedidoCommandBuilder.builder();
        var command = builder.withStatus(atualizarPedidoRequest.getStatus())
                .withIdComanda(atualizarPedidoRequest.getIdComanda())
                .withItens(atualizarPedidoRequest.getItemPedidos().stream().map(this.itemPedidoVOMapper::fromUpdateRequest).collect(Collectors.toList()))
                .withIdPedido(idPedido).build();

        var pedidoVO = this.pedidoService.update(command);
        return parseResponse(pedidoVO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deletarPedido(@ApiParam(value = "id do Pedido", required = true) @PathVariable("idPedido") UUID idPedido) {
        var builder = DeletarPedidoCommand.DeletarPedidoCommandBuilder.builder();
        var command = builder.withIdPedido(idPedido).build();

        this.pedidoService.delete(command);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PedidoResponse buscarPedido(@ApiParam(value = "id do Pedido", required = true) @PathVariable("idPedido") UUID idPedido) {
        var pedidoVO = this.pedidoService.get(idPedido);
        return parseResponse(pedidoVO);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PedidosResponseList listarPedidos(@ApiParam(value = "Identificador da Comanda") @Valid @RequestParam(value = "idComanda", required = false) UUID idComanda) {
        return this.pedidoService.list(idComanda).stream().map(this::parseResponse).collect(Collectors.toCollection(PedidosResponseList::new));
    }

    private PedidoResponse parseResponse(PedidoVO pedidoVO) {
        var response = new PedidoResponse();
        response.setIdComanda(pedidoVO.getIdComanda());
        response.setIdPedido(pedidoVO.getId());
        response.setDataPedido(pedidoVO.getDataPedido());
        response.setStatus(pedidoVO.getStatus().name());
        response.setItemPedidos(pedidoVO.getItens().stream().map(this.itemPedidoVOMapper::toResponse).collect(Collectors.toCollection(ItemPedidosResponseList::new)));
        return response;
    }

}
