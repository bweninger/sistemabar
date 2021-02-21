package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

/**
 * Objeto para criação de uma comanda.
 */
@ApiModel(description = "Objeto para criação de uma comanda.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class CriarComandaRequest {
    @JsonProperty("idUsuario")
    private UUID idUsuario = null;

    @JsonProperty("numeroComanda")
    private Long numeroComanda;

    @JsonProperty("dataInicioVigencia")
    private Instant dataInicioVigencia;

    @JsonProperty("tipoComanda")
    private String tipoComanda;

    @ApiModelProperty(required = false, value = "data de inicio da vigencia da comanda")
    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(Instant dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    @ApiModelProperty(required = false, value = "id do usuario")
    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    @ApiModelProperty(required = false, value = "numero da comanda fisica")
    public Long getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(Long numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    @ApiModelProperty(required = true, value = "Tipo da Comanda (Fisica ou Digital")
    public String getTipoComanda() {
        return tipoComanda;
    }

    public void setTipoComanda(String tipoComanda) {
        this.tipoComanda = tipoComanda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriarComandaRequest that = (CriarComandaRequest) o;
        return Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(dataInicioVigencia, that.dataInicioVigencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, tipoComanda, dataInicioVigencia, numeroComanda);
    }

    @Override
    public String toString() {
        return "CriarComandaRequest{" +
                "idUsuario=" + idUsuario +
                ", numeroComanda=" + numeroComanda +
                ", dataInicioVigencia=" + dataInicioVigencia +
                ", tipoComanda='" + tipoComanda + '\'' +
                '}';
    }
}

