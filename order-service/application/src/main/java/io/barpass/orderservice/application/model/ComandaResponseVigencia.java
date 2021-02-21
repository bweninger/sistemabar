package io.barpass.orderservice.application.model;

import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * vigencia da comanda
 */
@ApiModel(description = "vigencia da comanda")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class ComandaResponseVigencia {

    @JsonProperty("dataInicio")
    private Instant dataInicio = null;

    @JsonProperty("dataFim")
    private Instant dataFim = null;

  public ComandaResponseVigencia(Instant dataInicio, Instant dataFim) {
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
  }

  /**
     * Inicio de vigencia
     *
     * @return dataInicio
     **/
    @ApiModelProperty(value = "Inicio de vigencia")
    public Instant getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Instant dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Fim de vigencia
     *
     * @return dataFim
     **/
    @ApiModelProperty(value = "Fim de vigencia")
    public Instant getDataFim() {
        return dataFim;
    }

    public void setDataFim(Instant dataFim) {
        this.dataFim = dataFim;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComandaResponseVigencia comandaResponseVigencia = (ComandaResponseVigencia) o;
        return Objects.equals(this.dataInicio, comandaResponseVigencia.dataInicio) &&
                Objects.equals(this.dataFim, comandaResponseVigencia.dataFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataFim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComandaResponseVigencia {\n");

        sb.append("    dataInicio: ").append(toIndentedString(dataInicio)).append("\n");
        sb.append("    dataFim: ").append(toIndentedString(dataFim)).append("\n");
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

