package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.TipoComanda;
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
    public void validate(Comanda comanda) {
        comanda.getIdUsuario().ifPresent(idUsuario -> {
            Collection<Comanda> comandasByUsuario = this.comandaDataProvider.listByIdUsuarioVigente(idUsuario);
            if (!comandasByUsuario.isEmpty() && comandasByUsuario.stream().anyMatch(comanda1 -> !comanda1.getId().equals(comanda.getId()))) {
                throw new IllegalStateException("O usuario já possui comandas em aberto. Favor encerrá-las ou transferí-las para outro cliente.");
            }
        });

        var byNumeroVigente = this.comandaDataProvider.listByNumeroVigente(comanda.getNumeroComanda());
        if (!byNumeroVigente.isEmpty()) {
            throw new IllegalStateException(String.format("Comanda de numero %d esta aberta. Favor fecha-la antes de reabri-la.", comanda.getNumeroComanda()));
        }

        if (comanda.getDataFimVigencia().isPresent()) {
            throw new IllegalStateException("Comanda nao pode ser criada com Data Fim de Vigencia pré-estabelecida.");
        }

        if (comanda.getTipo().equals(TipoComanda.FISICA) && comanda.getNumeroComanda() == null) {
            throw new IllegalArgumentException("Numero da Comanda é obrigatório quando Comanda é do tipo Física.");
        }
    }

    @Override
    public Comanda doCreate(Comanda request) {
        return this.comandaDataProvider.create(request);
    }
}
