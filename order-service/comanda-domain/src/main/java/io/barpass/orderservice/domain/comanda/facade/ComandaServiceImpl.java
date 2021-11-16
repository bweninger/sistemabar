package io.barpass.orderservice.domain.comanda.facade;

import io.barpass.commons.domain.exception.NotFoundException;
import io.barpass.orderservice.domain.comanda.command.AtualizarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.CriarComandaCommand;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.TipoComanda;
import io.barpass.orderservice.domain.comanda.mapper.ComandaMapper;
import io.barpass.orderservice.domain.comanda.usecase.*;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ComandaServiceImpl implements ComandaService {

    private CriarComandaUseCase criarComandaUseCase;

    private AtualizarComandaUseCase atualizarComandaUseCase;

    private DeletarComandaUseCase deletarComandaUseCase;

    private BuscarComandaUseCase buscarComandaUseCase;

    private ListarComandasUseCase listarComandasUseCase;

    private ComandaMapper comandaMapper;

    @Autowired
    public ComandaServiceImpl(CriarComandaUseCase criarComandaUseCase, AtualizarComandaUseCase atualizarComandaUseCase,
                              DeletarComandaUseCase deletarComandaUseCase, BuscarComandaUseCase buscarComandaUseCase,
                              ListarComandasUseCase listarComandasUseCase, ComandaMapper comandaMapper) {
        this.criarComandaUseCase = criarComandaUseCase;
        this.atualizarComandaUseCase = atualizarComandaUseCase;
        this.deletarComandaUseCase = deletarComandaUseCase;
        this.buscarComandaUseCase = buscarComandaUseCase;
        this.listarComandasUseCase = listarComandasUseCase;
        this.comandaMapper = comandaMapper;
    }

    @Override
    public ComandaVO create(CriarComandaCommand criarComandaCommand) {
        var comanda = new Comanda();
        criarComandaCommand.getIdUsuario().ifPresent(comanda::setIdUsuario);
        criarComandaCommand.getNumeroComanda().ifPresent(comanda::setNumeroComanda);
        criarComandaCommand.getDataInicioVigencia().ifPresent(comanda::setDataInicioVigencia);
        comanda.setTipo(TipoComanda.valueOf(criarComandaCommand.getTipoComanda()));
        Comanda comandaCriada = this.criarComandaUseCase.create(comanda);
        return this.comandaMapper.toValueObject(comandaCriada);
    }

    @Override
    public ComandaVO update(AtualizarComandaCommand command) {
        var maybeComanda = this.buscarComandaUseCase.read(command.getIdComanda());
        if (maybeComanda.isEmpty()) {
            throw new NotFoundException("Comanda nao encontrada: {}", command.getIdComanda());
        }

        var comanda = maybeComanda.get();
        command.getIdUsuario().ifPresent(comanda::setIdUsuario);
        command.getDataFimVigencia().ifPresent(comanda::setDataFimVigencia);
        Comanda comandaAtualizada = this.atualizarComandaUseCase.update(comanda.getId(), comanda);
        return this.comandaMapper.toValueObject(comandaAtualizada);
    }

    @Override
    public void delete(UUID idComanda) {
        this.deletarComandaUseCase.delete(idComanda);
    }


    @Override
    public ComandaVO get(UUID idComanda) {
        return this.buscarComandaUseCase.read(idComanda).map(this.comandaMapper::toValueObject).
                orElseThrow(() -> new NotFoundException("Comanda nao encontrada: {}", idComanda));
    }

    @Override
    public List<ComandaVO> list(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia) {
        return this.listarComandasUseCase.listByIdUsuarioNumeroAndVigencia(idUsuario, numeroComanda, dataVigencia).stream().
                map(this.comandaMapper::toValueObject).collect(Collectors.toList());
    }

    @Override
    public Optional<ComandaVO> obterComandaPorNumeroEVigencia(Long numeroComanda, LocalDateTime date) {
        return this.buscarComandaUseCase.getByNumeroAndDate(numeroComanda, date).map(this.comandaMapper::toValueObject);
    }

}
