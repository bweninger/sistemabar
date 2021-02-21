package io.barpass.orderservice.application.model;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Objeto para criação de uma comanda.
 */
@ApiModel(description = "Objeto para criação de uma comanda.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class CriarComandaRequest {
    @JsonProperty("idUsuario")
    private UUID idUsuario = null;

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("dataInicioVigencia")
    private Instant dataInicioVigencia;

    @ApiModelProperty(required = false, value = "id da comanda")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @ApiModelProperty(required = false, value = "data de inicio da vigencia da comanda")
    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(Instant dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    /**
     * id do usuario
     *
     * @return idUsuario
     **/
    @ApiModelProperty(required = false, value = "id do usuario")
    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CriarComandaRequest that = (CriarComandaRequest) o;
    return Objects.equals(idUsuario, that.idUsuario) &&
            Objects.equals(id, that.id) &&
            Objects.equals(dataInicioVigencia, that.dataInicioVigencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, id, dataInicioVigencia);
  }

  @Override
  public String toString() {
    return "CriarComandaRequest{" +
            "idUsuario=" + idUsuario +
            ", id=" + id +
            ", dataInicioVigencia=" + dataInicioVigencia +
            '}';
  }
}

