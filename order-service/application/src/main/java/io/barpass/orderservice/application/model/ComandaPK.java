package io.barpass.orderservice.application.model;

import java.time.Instant;
import java.util.UUID;

public class ComandaPK {

    public UUID id;

    public Instant dataInicioVigencia;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(Instant dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }
}
