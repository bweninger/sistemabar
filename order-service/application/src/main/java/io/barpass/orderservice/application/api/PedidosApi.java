/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.barpass.orderservice.application.api;

import io.barpass.orderservice.application.model.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.Instant;
import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")

@Api(value = "pedidos", description = "the pedidos API")
@RequestMapping(value = "/v1")
public interface PedidosApi {

    @ApiOperation(value = "Atualizar Pedido", nickname = "atualizarPedido", notes = "", response = PedidoResponse.class, tags = {"AtualizarPedido",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = PedidoResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/pedidos/{idPedido}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.PUT)
    PedidoResponse atualizarPedido(@ApiParam(value = "id do pedido", required = true) @PathVariable("idPedido") UUID idPedido, @ApiParam(value = "", required = true) @Valid @RequestBody AtualizarPedidoRequest atualizarPedidoRequest);


    @ApiOperation(value = "Buscar Pedido", nickname = "buscarPedido", notes = "", response = PedidoResponse.class, tags = {"BuscarPedido",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = PedidoResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/pedidos/{idPedido}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    PedidoResponse buscarPedido(@ApiParam(value = "id do Pedido", required = true) @PathVariable("idPedido") UUID idPedido);


    @ApiOperation(value = "Criar Pedido", nickname = "criarPedido", notes = "", response = PedidoResponse.class, tags = {"CriarPedido",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created", response = PedidoResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/pedidos",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.POST)
    PedidoResponse criarPedido(@ApiParam(value = "", required = true) @Valid @RequestBody CriarPedidoRequest criarPedidoRequest);


    @ApiOperation(value = "Deletar Pedido", nickname = "deletarPedido", notes = "", tags = {"DeletarPedido",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/pedidos/{idPedido}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.DELETE)
    void deletarPedido(@ApiParam(value = "id do Pedido", required = true) @PathVariable("idPedido") UUID idPedido);


    @ApiOperation(value = "Listar todos os Pedidos", nickname = "listarPedidos", notes = "", response = PedidosResponseList.class, tags = {"ListarPedidos",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = PedidosResponseList.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/pedidos",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    PedidosResponseList listarPedidos(@ApiParam(value = "Identificador da Comanda") @Valid @RequestParam(value = "idComanda", required = false) UUID idComanda);

}
