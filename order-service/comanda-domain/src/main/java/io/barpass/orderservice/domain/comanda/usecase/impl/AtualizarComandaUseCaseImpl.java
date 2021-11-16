package io.barpass.orderservice.domain.comanda.usecase.impl;

import io.barpass.commons.domain.usecase.impl.AbstractUpdateUseCaseImpl;
import io.barpass.orderservice.domain.comanda.dataprovider.ComandaDataProvider;
import io.barpass.orderservice.domain.comanda.entity.Comanda;
import io.barpass.orderservice.domain.comanda.entity.StatusComanda;
import io.barpass.orderservice.domain.comanda.usecase.AtualizarComandaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component
public class AtualizarComandaUseCaseImpl extends AbstractUpdateUseCaseImpl<Comanda, UUID> implements AtualizarComandaUseCase {

    private final ComandaDataProvider comandaDataProvider;

    @Autowired
    public AtualizarComandaUseCaseImpl(ComandaDataProvider comandaDataProvider) {
        super(comandaDataProvider);
        this.comandaDataProvider = comandaDataProvider;
    }

    @Override
    public void validate(Comanda old, Comanda entity) {
        entity.getIdUsuario().ifPresent(idUsuario -> {
            Collection<Comanda> comandasByUsuario = this.comandaDataProvider.listByIdUsuarioVigente(idUsuario);
            if (!comandasByUsuario.isEmpty() && comandasByUsuario.stream().anyMatch(comanda1 -> !comanda1.getId().equals(entity.getId()))) {
                throw new IllegalStateException("O usuario já possui comandas em aberto. Favor encerrá-las ou transferí-las para outro cliente.");
            }
        });

        entity.getDataFimVigencia().ifPresent(dataFim -> {
            if (dataFim.isBefore(entity.getDataInicioVigencia())) {
                throw new IllegalArgumentException("Data Fim de Vigencia deve ser posterior à Data Inicio de Vigencia da comanda.");
            }
        });

        if(!StatusComanda.isValidTransition(old.getStatus(), entity.getStatus())){
            throw new IllegalArgumentException(String.format("Transição de estado inválida: %s -> %s", old.getStatus().toString(),
                    entity.getStatus().toString()));
        }
    }

}
