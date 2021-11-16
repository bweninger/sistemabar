package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.usecase.BuscarComandaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Component
public class BuscarComandaUseCaseImpl implements BuscarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Autowired
    public BuscarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Optional<Comanda> getByUserAndDate(UUID idUsuario, LocalDateTime date) {
        return this.comandaDataProvider.listByUsuarioNumeroAndVigencia(idUsuario, null, date).stream().findFirst();
    }

    @Override
    public Optional<Comanda> getByNumeroAndDate(Long numeroComanda, LocalDateTime date) {
        return this.comandaDataProvider.getByNumeroAndVigencia(numeroComanda, date);
    }

    @Override
    public Optional<Comanda> read(UUID idComanda) {
        if (Objects.isNull(idComanda)) {
            throw new IllegalArgumentException("Id da Comanda obrigatorio para buscar uma comnada.");
        }

        return Optional.ofNullable(this.comandaDataProvider.get(idComanda));
    }
}
