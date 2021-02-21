package io.barpass.orderservice.domain.pedido.vo;

import java.time.Instant;
import java.util.UUID;

public class PedidoVO {

    private UUID id;

    private UUID idUsuario;

    private Instant dataInicioVigencia;

    private Instant dataFimVigencia;

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

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Instant getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(Instant dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }
}
