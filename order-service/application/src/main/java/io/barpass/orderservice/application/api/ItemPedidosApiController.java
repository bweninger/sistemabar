package io.barpass.orderservice.application.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.barpass.orderservice.application.model.AtualizarItemPedidoRequest;
import io.barpass.orderservice.application.model.CriarItemPedidoRequest;
import io.barpass.orderservice.application.model.ItemPedidoResponse;
import io.barpass.orderservice.application.model.ItemPedidosResponseList;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")

@Controller
public class ItemPedidosApiController implements ItemPedidosApi {

    private static final Logger log = LoggerFactory.getLogger(ItemPedidosApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ItemPedidosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ItemPedidoResponse> atualizarItemPedido(@ApiParam(value = "id do Item pedido",required=true) @PathVariable("idItemPedido") String idItemPedido, @ApiParam(value = "" ,required=true )  @Valid @RequestBody AtualizarItemPedidoRequest atualizarItemPedidoRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<ItemPedidoResponse>(objectMapper.readValue("{  \"idProduto\" : \"{}\",  \"idItemPedido\" : \"idItemPedido\",  \"idPedido\" : \"idPedido\",  \"quantidade\" : 0,  \"status\" : \"status\"}", ItemPedidoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<ItemPedidoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ItemPedidoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ItemPedidoResponse> buscarItemPedido(@ApiParam(value = "id do Item Pedido",required=true) @PathVariable("idItemPedido") String idItemPedido) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<ItemPedidoResponse>(objectMapper.readValue("{  \"idProduto\" : \"{}\",  \"idItemPedido\" : \"idItemPedido\",  \"idPedido\" : \"idPedido\",  \"quantidade\" : 0,  \"status\" : \"status\"}", ItemPedidoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<ItemPedidoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ItemPedidoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ItemPedidoResponse> criarItemPedido(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CriarItemPedidoRequest criarItemPedidoRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<ItemPedidoResponse>(objectMapper.readValue("{  \"idProduto\" : \"{}\",  \"idItemPedido\" : \"idItemPedido\",  \"idPedido\" : \"idPedido\",  \"quantidade\" : 0,  \"status\" : \"status\"}", ItemPedidoResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<ItemPedidoResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ItemPedidoResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletarItemPedido(@ApiParam(value = "id do Item Pedido",required=true) @PathVariable("idItemPedido") String idItemPedido) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ItemPedidosResponseList> listarItemPedidos(@ApiParam(value = "Identificador do Pedido") @Valid @RequestParam(value = "idPedido", required = false) String idPedido) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<ItemPedidosResponseList>(objectMapper.readValue("\"\"", ItemPedidosResponseList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<ItemPedidosResponseList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ItemPedidosResponseList>(HttpStatus.NOT_IMPLEMENTED);
    }

}
