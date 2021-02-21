package io.barpass.orderservice.domain.comanda.vo;

import io.barpass.orderservice.domain.comanda.entity.TipoComanda;

import java.time.Instant;
import java.util.UUID;

public class ComandaVO {

    private UUID id;

    private UUID idUsuario;

    private Instant dataInicioVigencia;

    private Instant dataFimVigencia;

    private TipoComanda tipoComanda;

    private Long numeroComanda;

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

    public TipoComanda getTipoComanda() {
        return tipoComanda;
    }

    public void setTipoComanda(TipoComanda tipoComanda) {
        this.tipoComanda = tipoComanda;
    }

    public Long getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(Long numeroComanda) {
        this.numeroComanda = numeroComanda;
    }
}
