package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.ComandaPK;
import io.barpass.orderservice.domain.comanda.usecase.AtualizarComandaUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
public class AtualizarComandaUseCaseImpl implements AtualizarComandaUseCase {

    private ComandaDataProvider comandaDataProvider;

    @Inject
    public AtualizarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public Comanda update(ComandaPK comandaPK, Comanda comanda) {
        comanda.getIdUsuario().ifPresent(idUsuario -> {
            Collection<Comanda> comandasByUsuario = this.comandaDataProvider.listByIdUsuarioVigente(idUsuario);
            if (!comandasByUsuario.isEmpty()) {
                throw new IllegalStateException("O usuario já possui comandas em aberto. Favor encerrá-las ou transferí-las para outro cliente.");
            }
        });

        comanda.getDataFimVigencia().ifPresent(dataFim -> {
            if (dataFim.isBefore(comandaPK.getDataInicioVigencia())) {
                throw new IllegalArgumentException("Data Fim de Vigencia deve ser posterior à Data Inicio de Vigencia da comanda.");
            }
        });

        return this.comandaDataProvider.update(comandaPK.getId(), comandaPK.getDataInicioVigencia(), comanda);
    }
}
