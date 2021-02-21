package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.usecase.ListarComandasUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

@Named
public class ListarComandasUseCaseImpl implements ListarComandasUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public ListarComandasUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Collection<Comanda> list() {
        return this.comandaDataProvider.getAll();
    }

    @Override
    public Collection<Comanda> listByIdUsuarioNumeroAndVigencia(UUID idUsuario, Long numeroComanda, Instant dataVigencia) {
        if (idUsuario == null && numeroComanda == null && dataVigencia == null) {
            return list();
        } else {
            return this.comandaDataProvider.listByUsuarioNumeroAndVigencia(idUsuario, numeroComanda, dataVigencia);
        }
    }
}
