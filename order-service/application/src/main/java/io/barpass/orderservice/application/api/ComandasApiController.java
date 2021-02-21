package io.barpass.orderservice.application.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.barpass.orderservice.application.model.*;
import io.barpass.orderservice.domain.comanda.command.AtualizarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.CriarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.DeletarComandaCommand;
import io.barpass.orderservice.domain.comanda.facade.ComandaService;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
@Controller
public class ComandasApiController implements ComandasApi {

    private static final Logger log = LoggerFactory.getLogger(ComandasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ComandaService comandaService;

    @Autowired
    public ComandasApiController(ObjectMapper objectMapper, HttpServletRequest request, ComandaService comandaService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.comandaService = comandaService;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ComandaResponse atualizarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda,
                                            @ApiParam(value = "", required = true) @Valid @RequestBody AtualizarComandaRequest atualizarComandaRequest) {
        var builder = AtualizarComandaCommand.AtualizarComandaCommandBuilder.builder();
        AtualizarComandaCommand command = builder.withIdComanda(idComanda)
                .withDataFimVigencia(atualizarComandaRequest.getVigencia().getDataFim())
                .withIdUsuario(atualizarComandaRequest.getIdUsuario()).build();

        return parseResponse(this.comandaService.update(command));
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ComandaResponse buscarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda) {
        ComandaVO comandaVO = this.comandaService.get(idComanda);
        return parseResponse(comandaVO);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ComandaResponse criarComanda(@ApiParam(value = "", required = true) @Valid @RequestBody CriarComandaRequest criarComandaRequest) {
        var builder = CriarComandaCommand.CriarComandaCommandBuilder.builder();
        CriarComandaCommand command = builder.withNumeroComanda(criarComandaRequest.getNumeroComanda())
                .withDataInicioVigencia(criarComandaRequest.getDataInicioVigencia())
                .withIdUsuario(criarComandaRequest.getIdUsuario())
                .withTipoComanda(criarComandaRequest.getTipoComanda()).build();

        return parseResponse(this.comandaService.create(command));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deletarComanda(@ApiParam(value = "id da comanda", required = true) @PathVariable("idComanda") UUID idComanda) {
        var builder = DeletarComandaCommand.DeletarComandaCommandBuilder.builder();
        DeletarComandaCommand command = builder.withIdComanda(idComanda).build();

        this.comandaService.delete(command);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ComandaResponseList listarComandas(@ApiParam(value = "Identificador Unico do Usuario") @Valid @RequestParam(value = "idUsuario", required = false) UUID idUsuario,
                                              @ApiParam(value = "Numero da COmanda Fisica") @Valid @RequestParam(value = "numero", required = false) Long numero,
                                              @ApiParam(value = "Data de Vigencia da Comanda") @Valid @RequestParam(value = "dataVigencia", required = false) Instant dataVigencia) {
        List<ComandaVO> list = this.comandaService.list(idUsuario, numero, dataVigencia);
        return new ComandaResponseList(list.stream().map(this::parseResponse).collect(Collectors.toList()));
    }

    private ComandaResponse parseResponse(ComandaVO comandaVO) {
        var response = new ComandaResponse();
        response.setIdComanda(comandaVO.getId());
        response.setIdUsuario(comandaVO.getIdUsuario());
        response.setVigencia(new ComandaResponseVigencia(comandaVO.getDataInicioVigencia(), comandaVO.getDataFimVigencia()));
        return response;
    }

}
