package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.usecase.ListarComandasUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

@Component
public class ListarComandasUseCaseImpl implements ListarComandasUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Autowired
    public ListarComandasUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Collection<Comanda> list() {
        return this.comandaDataProvider.getAll();
    }

    @Override
    public Collection<Comanda> listByIdUsuarioNumeroAndVigencia(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia) {
        if (idUsuario == null && numeroComanda == null && dataVigencia == null) {
            return list();
        } else {
            return this.comandaDataProvider.listByUsuarioNumeroAndVigencia(idUsuario, numeroComanda, dataVigencia);
        }
    }
}
