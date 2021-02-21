package io.barpass.orderservice.domain.comanda.usecase;

import io.barpass.commons.domain.usecase.UpdateUseCase;
import io.barpass.orderservice.domain.comanda.entity.Comanda;

import java.util.UUID;

public interface AtualizarComandaUseCase extends UpdateUseCase<Comanda, UUID> {

}
