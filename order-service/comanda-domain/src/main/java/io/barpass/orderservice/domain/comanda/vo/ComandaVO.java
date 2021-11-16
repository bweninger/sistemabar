package io.barpass.orderservice.domain.comanda.vo;

import io.barpass.orderservice.domain.comanda.entity.TipoComanda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public class ComandaVO {

    private UUID id;

    private UUID idUsuario;

    private LocalDateTime dataInicioVigencia;

    private LocalDateTime dataFimVigencia;

    private TipoComanda tipoComanda;

    private Long numeroComanda;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
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

    public LocalDateTime getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(LocalDateTime dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public LocalDateTime getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(LocalDateTime dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }
}
