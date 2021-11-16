package io.barpass.orderservice.domain.comanda.entity;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class Comanda {

    private UUID id;

    private Long numeroComanda;

    private UUID idUsuario;

    private LocalDateTime dataInicioVigencia;

    private LocalDateTime dataFimVigencia;

    private TipoComanda tipo;

    private StatusComanda status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(Long numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoComanda getTipo() {
        return tipo;
    }

    public void setTipo(TipoComanda tipo) {
        this.tipo = tipo;
    }

    public StatusComanda getStatus() {
        return status;
    }

    public void setStatus(StatusComanda status) {
        this.status = status;
    }

    public LocalDateTime getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(LocalDateTime dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public Optional<LocalDateTime> getDataFimVigencia() {
        return Optional.ofNullable(dataFimVigencia);
    }

    public void setDataFimVigencia(LocalDateTime dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }
}
