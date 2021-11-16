package io.barpass.orderservice.domain.comanda.facade;

import io.barpass.orderservice.domain.comanda.command.AtualizarComandaCommand;
import io.barpass.orderservice.domain.comanda.command.CriarComandaCommand;
import io.barpass.orderservice.domain.comanda.vo.ComandaVO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ComandaService {

    ComandaVO create(CriarComandaCommand command);

    ComandaVO update(AtualizarComandaCommand command);

    void delete(UUID idComanda);

    ComandaVO get(UUID idComanda);

    List<ComandaVO> list(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia);

    Optional<ComandaVO> obterComandaPorNumeroEVigencia(Long numeroComanda, LocalDateTime date);
}
