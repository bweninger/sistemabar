package io.barpass.orderservice.application.repository.entity;

import io.barpass.commons.domain.dataprovider.WithId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "comanda")
@Entity
public class ComandaEntity implements WithId<UUID> {

    @Id
    private UUID id;

    @Column(name = "numero_comanda")
    private Long numeroComanda;

    @Column(name = "id_usuario")
    private UUID idUsuario;

    @Column(name = "data_inicio_vigencia")
    private LocalDateTime dataInicioVigencia;

    @Column(name = "data_fim_vigencia")
    private LocalDateTime dataFimVigencia;

    private String tipo;

    private String status;

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

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
