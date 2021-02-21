package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.ComandaPK;
import io.barpass.orderservice.domain.comanda.usecase.BuscarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Objects;

@Named
public class BuscarComandaUseCaseImpl implements BuscarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public BuscarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Comanda read(ComandaPK comandaPK) {
        if (Objects.isNull(comandaPK.getId()) || Objects.isNull(comandaPK.getDataInicioVigencia())) {
            throw new IllegalArgumentException("Id da Comanda e Data de Inicio de Vigencia sao obrigatorios para buscar uma comnada.");
        }

        return this.comandaDataProvider.get(comandaPK.getId(), comandaPK.getDataInicioVigencia());
    }
}
