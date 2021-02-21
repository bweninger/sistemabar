package io.barpass.orderservice.domain.comanda.facade;

import io.barpass.commons.domain.exception.NotFoundException;
import io.barpass.orderservice.domain.comanda.command.AtualizarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.CriarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.DeletarComandaCommand;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.ComandaPK;
import io.barpass.orderservice.domain.comanda.mapper.ComandaMapper;
import io.barpass.orderservice.domain.comanda.usecase.*;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;

import javax.inject.Inject;
import javax.inject.Named;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Named
public class ComandaServiceImpl implements ComandaService {

    private CriarComandaUseCase criarComandaUseCase;

    private AtualizarComandaUseCase atualizarComandaUseCase;

    private DeletarComandaUseCase deletarComandaUseCase;

    private BuscarComandaUseCase buscarComandaUseCase;

    private ListarComandasUseCase listarComandasUseCase;

    private ComandaMapper comandaMapper;

    @Inject
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
    public ComandaVO create(CriarComandaCommand command) {
        var comanda = new Comanda();
        command.getIdUsuario().ifPresent(comanda::setIdUsuario);
        comanda.setComandaPK(new ComandaPK(command.getIdComanda().orElse(null), command.getDataInicioVigencia().orElse(Instant.now())));
        Comanda comandaCriada = this.criarComandaUseCase.create(comanda);
        return this.comandaMapper.toValueObject(comandaCriada);
    }

    @Override
    public ComandaVO update(AtualizarComandaCommand command) {
        var maybeComanda = this.buscarComandaUseCase.getByUserAndDate(command.getIdComanda(), command.getDataVigencia());
        if (!maybeComanda.isPresent()) {
            throw new NotFoundException("Comanda nao encontrada para o usuario {} na data {}", command.getIdComanda(), command.getDataVigencia());
        }

        var comanda = maybeComanda.get();
        command.getIdUsuario().ifPresent(comanda::setIdUsuario);
        command.getDataFimVigencia().ifPresent(comanda::setDataFimVigencia);
        Comanda comandaAtualizada = this.atualizarComandaUseCase.update(comanda.getComandaPK(), comanda);
        return this.comandaMapper.toValueObject(comandaAtualizada);
    }

    @Override
    public void delete(DeletarComandaCommand command) {
        this.deletarComandaUseCase.delete(new ComandaPK(command.getIdComanda(), command.getDataVigencia()));
    }


    @Override
    public ComandaVO get(UUID comandaId, Instant dataVigencia) {
        return this.comandaMapper.toValueObject(this.buscarComandaUseCase.read(new ComandaPK(comandaId, dataVigencia)));
    }

    @Override
    public List<ComandaVO> list(UUID idUsuario, Instant dataVigencia) {
        return this.listarComandasUseCase.list().stream().map(this.comandaMapper::toValueObject).collect(Collectors.toList());
    }

}
