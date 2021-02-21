package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.usecase.DeletarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

@Named
public class DeletarComandaUseCaseImpl implements DeletarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public DeletarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public void doDelete(UUID primaryKey) {
        this.comandaDataProvider.delete(primaryKey);
    }
}
