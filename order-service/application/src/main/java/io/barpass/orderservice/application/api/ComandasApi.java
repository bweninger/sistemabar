package io.barpass.orderservice.application.api;

import io.barpass.orderservice.application.model.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")

@Api(value = "comandas", description = "the comandas API")
@RequestMapping(value = "/v1")
public interface ComandasApi {

    @ApiOperation(value = "Atualizar Comanda", nickname = "atualizarComanda", notes = "", response = ComandaResponse.class, tags = {"AtualizarComanda",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ComandaResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/comandas/{idComanda}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.PUT)
    ComandaResponse atualizarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda,
                                     @ApiParam(value = "", required = true) @Valid @RequestBody AtualizarComandaRequest atualizarComandaRequest);


    @ApiOperation(value = "Buscar Comanda", nickname = "buscarComanda", notes = "", response = ComandaResponse.class, tags = {"BuscarComanda",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ComandaResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/comandas/{idComanda}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    ComandaResponse buscarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda);


    @ApiOperation(value = "Criar Comanda", nickname = "criarComanda", notes = "", response = ComandaResponse.class, tags = {"CriarComanda",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created", response = ComandaResponse.class),
            @ApiResponse(code = 400, message = "Bad Request List of supported error codes:   - 21: Missing body   - 22: Invalid body   - 23: Missing body field   - 24: Invalid body field", response = ErrorRepresentation.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/comandas",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.POST)
    ComandaResponse criarComanda(@ApiParam(value = "", required = true) @Valid @RequestBody CriarComandaRequest criarComandaRequest);


    @ApiOperation(value = "Deletar Comanda", nickname = "deletarComanda", notes = "", tags = {"DeletarComanda",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/comandas/{idComanda}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.DELETE)
    void deletarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda);


    @ApiOperation(value = "Listar todas as Comandas", nickname = "listarComandas", notes = "", response = ComandaResponseList.class, tags = {"ListarComanda",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ComandaResponseList.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorRepresentation.class),
            @ApiResponse(code = 403, message = "Forbidden", response = ErrorRepresentation.class),
            @ApiResponse(code = 404, message = "Not Found List of supported error codes:   - 60: Resource not found", response = ErrorRepresentation.class),
            @ApiResponse(code = 405, message = "Method Not Allowed List of supported error codes:   - 61: Method not allowed", response = ErrorRepresentation.class)})
    @RequestMapping(value = "/comandas",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    ComandaResponseList listarComandas(@ApiParam(value = "Identificador Unico do Usuario") @Valid @RequestParam(value = "idUsuario", required = false) UUID idUsuario,
                                       @ApiParam(value = "Numero da Comanda Fisica") @Valid @RequestParam(value = "numero", required = false) Long numero,
                                       @ApiParam(value = "Data de Vigencia da Comanda") @Valid @RequestParam(value = "dataVigencia", required = false) LocalDateTime dataVigencia);

}
