package io.barpass.orderservice.domain.comanda.entity;

import java.time.Instant;
import java.util.UUID;

public class ComandaPK {

    private UUID id;

    private Instant dataInicioVigencia;

    public UUID getId() {
        return id;
    }

    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public ComandaPK(UUID id, Instant dataInicioVigencia) {
        this.id = id;
        this.dataInicioVigencia = dataInicioVigencia;
    }
}
