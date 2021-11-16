package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.usecase.DeletarComandaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeletarComandaUseCaseImpl implements DeletarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Autowired
    public DeletarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public void doDelete(UUID primaryKey) {
        this.comandaDataProvider.delete(primaryKey);
    }
}
