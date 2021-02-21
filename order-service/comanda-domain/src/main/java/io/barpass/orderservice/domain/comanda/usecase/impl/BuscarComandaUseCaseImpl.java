package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.usecase.BuscarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Named
public class BuscarComandaUseCaseImpl implements BuscarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public BuscarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Optional<Comanda> getByUserAndDate(UUID idUsuario, Instant date) {
        return this.comandaDataProvider.listByUsuarioNumeroAndVigencia(idUsuario, null, date).stream().findFirst();
    }

    @Override
    public Optional<Comanda> read(UUID uuid) {
        if (Objects.isNull(uuid)) {
            throw new IllegalArgumentException("Id da Comanda obrigatorio para buscar uma comnada.");
        }

        return Optional.ofNullable(this.comandaDataProvider.get(uuid));
    }
}
