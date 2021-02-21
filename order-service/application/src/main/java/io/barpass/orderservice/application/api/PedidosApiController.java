package io.barpass.orderservice.application.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.barpass.orderservice.application.mapper.ItemPedidoVOMapper;
import io.barpass.orderservice.application.model.AtualizarPedidoRequest;
import io.barpass.orderservice.application.model.CriarPedidoRequest;
import io.barpass.orderservice.application.model.PedidoResponse;
import io.barpass.orderservice.application.model.PedidosResponseList;
import io.barpass.orderservice.domain.pedido.command.CriarPedidoCommand;
import io.barpass.orderservice.domain.pedido.facade.PedidoService;
import io.barpass.orderservice.domain.pedido.vo.PedidoVO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.threeten.bp.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
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

    public ResponseEntity<PedidoResponse> atualizarPedido(@ApiParam(value = "id do pedido",required=true) @PathVariable("idPedido") String idPedido, @ApiParam(value = "" ,required=true )  @Valid @RequestBody AtualizarPedidoRequest atualizarPedidoRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<PedidoResponse>(objectMapper.readValue("{  \"idComanda\" : \"{}\",  \"itemPedidos\" : [ \"\", \"\" ],  \"dataPedido\" : \"2000-01-23\",  \"idPedido\" : \"idPedido\",  \"status\" : \"status\"}", PedidoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<PedidoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PedidoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PedidoResponse> buscarPedido(@ApiParam(value = "id do Pedido",required=true) @PathVariable("idPedido") String idPedido) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<PedidoResponse>(objectMapper.readValue("{  \"idComanda\" : \"{}\",  \"itemPedidos\" : [ \"\", \"\" ],  \"dataPedido\" : \"2000-01-23\",  \"idPedido\" : \"idPedido\",  \"status\" : \"status\"}", PedidoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<PedidoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PedidoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoResponse criarPedido(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CriarPedidoRequest criarPedidoRequest) {
       var builder = CriarPedidoCommand.CriarPedidoCommandBuilder.builder();
        var command = builder.withIdComanda(criarPedidoRequest.getIdComanda())
                .withItens(criarPedidoRequest.getItemPedidos().stream().map(this.itemPedidoVOMapper::fromRequest).collect(Collectors.toList())).build();

        var pedidoVO = this.pedidoService.create(command);
        var response = new PedidoResponse();
        return null;
    }

    public ResponseEntity<Void> deletarPedido(@ApiParam(value = "id do Pedido",required=true) @PathVariable("idPedido") String idPedido) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PedidosResponseList> listarPedidos(@ApiParam(value = "Identificador da Comanda") @Valid @RequestParam(value = "idComanda", required = false) String idComanda,@ApiParam(value = "Data de Vigencia da Comanda") @Valid @RequestParam(value = "dataVigencia", required = false) LocalDate dataVigencia) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<PedidosResponseList>(objectMapper.readValue("\"\"", PedidosResponseList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<PedidosResponseList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PedidosResponseList>(HttpStatus.NOT_IMPLEMENTED);
    }

}
