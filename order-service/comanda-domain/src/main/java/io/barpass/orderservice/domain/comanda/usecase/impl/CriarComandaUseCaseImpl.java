package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.usecase.CriarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
public class CriarComandaUseCaseImpl implements CriarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public CriarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public void validate(Comanda request) {
        request.getIdUsuario().ifPresent(idUsuario -> {
            Collection<Comanda> comandasByUsuario = this.comandaDataProvider.listByIdUsuarioVigente(idUsuario);
            if (!comandasByUsuario.isEmpty()) {
                throw new IllegalStateException("O usuario já possui comandas em aberto. Favor encerrá-las ou transferí-las para outro cliente.");
            }
        });

        if (request.getDataFimVigencia().isPresent()) {
            throw new IllegalStateException("Comanda nao pode ser criada com Data Fim de Vigencia pré-estabelecida.");
        }
    }

    @Override
    public Comanda doCreate(Comanda request) {
        return this.comandaDataProvider.create(request);
    }
}
