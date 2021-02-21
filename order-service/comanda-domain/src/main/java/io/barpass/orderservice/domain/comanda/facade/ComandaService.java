package io.barpass.orderservice.domain.comanda.facade;

import io.barpass.orderservice.domain.comanda.command.AtualizarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.CriarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.DeletarComandaCommand;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface ComandaService {

    ComandaVO create(CriarComandaCommand command);

    ComandaVO update(AtualizarComandaCommand command);

    void delete(DeletarComandaCommand command);

    ComandaVO get(UUID comandaId, Instant dataVigencia);

    List<ComandaVO> list(UUID idUsuario, Instant dataVigencia);
}
