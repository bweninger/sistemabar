package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

/**
 * Objeto para atualizacao de uma comanda.
 */
@ApiModel(description = "Objeto para atualizacao de uma comanda.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class AtualizarComandaRequest   {
  @JsonProperty("idUsuario")
  private UUID idUsuario = null;

  @JsonProperty("vigencia")
  private AtualizarComandaRequestVigencia vigencia = null;

  /**
   * id do usuario
   * @return idUsuario
  **/
  @ApiModelProperty(required = true, value = "id do usuario")
  @NotNull
  public UUID getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(UUID idUsuario) {
    this.idUsuario = idUsuario;
  }

  /**
   * Get vigencia
   * @return vigencia
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public AtualizarComandaRequestVigencia getVigencia() {
    return vigencia;
  }

  public void setVigencia(AtualizarComandaRequestVigencia vigencia) {
    this.vigencia = vigencia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtualizarComandaRequest atualizarComandaRequest = (AtualizarComandaRequest) o;
    return Objects.equals(this.idUsuario, atualizarComandaRequest.idUsuario) &&
        Objects.equals(this.vigencia, atualizarComandaRequest.vigencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, vigencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtualizarComandaRequest {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    vigencia: ").append(toIndentedString(vigencia)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

