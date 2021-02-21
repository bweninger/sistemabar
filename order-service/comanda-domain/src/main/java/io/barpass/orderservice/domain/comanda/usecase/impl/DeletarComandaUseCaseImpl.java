package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.ComandaPK;
import io.barpass.orderservice.domain.comanda.usecase.DeletarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Objects;

@Named
public class DeletarComandaUseCaseImpl implements DeletarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public DeletarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public void delete(ComandaPK primaryKey) {
        if (Objects.isNull(primaryKey.getId()) || Objects.isNull(primaryKey.getDataInicioVigencia())) {
            throw new IllegalArgumentException("Id da Comanda e Data de Inicio de Vigencia sao obrigatorios para deletar uma comnada.");
        }
        this.comandaDataProvider.delete(primaryKey.getId(), primaryKey.getDataInicioVigencia());
    }
}
