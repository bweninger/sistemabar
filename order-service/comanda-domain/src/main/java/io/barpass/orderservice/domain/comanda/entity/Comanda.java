package io.barpass.orderservice.domain.comanda.entity;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class Comanda {

    private UUID id;

    private Long numeroComanda;

    private UUID idUsuario;

    private Instant dataInicioVigencia;

    private Instant dataFimVigencia;

    private TipoComanda tipo;

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

    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(Instant dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
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

    public TipoComanda getTipo() {
        return tipo;
    }

    public void setTipo(TipoComanda tipo) {
        this.tipo = tipo;
    }
}
