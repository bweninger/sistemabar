package io.barpass.orderservice.domain.comanda.entity;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class Comanda {

    private ComandaPK comandaPK;

    private UUID idUsuario;

    private Instant dataFimVigencia;

    public ComandaPK getComandaPK() {
        return comandaPK;
    }

    public void setComandaPK(ComandaPK comandaPK) {
        this.comandaPK = comandaPK;
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Optional<Instant> getDataFimVigencia() {
        return Optional.ofNullable(dataFimVigencia);
    }

    public void setDataFimVigencia(Instant dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }
}
