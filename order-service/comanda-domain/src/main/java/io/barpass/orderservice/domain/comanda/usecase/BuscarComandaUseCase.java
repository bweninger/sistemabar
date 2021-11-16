package io.barpass.orderservice.domain.comanda.usecase;

import io.barpass.commons.domain.usecase.ReadUseCase;
import io.barpass.orderservice.domain.comanda.entity.Comanda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public interface BuscarComandaUseCase extends ReadUseCase<Comanda, UUID> {

    Optional<Comanda> getByUserAndDate(UUID idUsuario, LocalDateTime date);

    Optional<Comanda> getByNumeroAndDate(Long numeroComanda, LocalDateTime date);
}
