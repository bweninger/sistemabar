package io.barpass.orderservice.application.model;

import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * vigencia da comanda
 */
@ApiModel(description = "vigencia da comanda")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class AtualizarComandaRequestVigencia {
    @JsonProperty("dataInicio")
    private Instant dataInicio = null;

    @JsonProperty("dataFim")
    private Instant dataFim = null;

    /**
     * Inicio de vigencia
     *
     * @return dataInicio
     **/
    @ApiModelProperty(value = "Inicio de vigencia")
    @Valid
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
    @Valid
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
        AtualizarComandaRequestVigencia atualizarComandaRequestVigencia = (AtualizarComandaRequestVigencia) o;
        return Objects.equals(this.dataInicio, atualizarComandaRequestVigencia.dataInicio) &&
                Objects.equals(this.dataFim, atualizarComandaRequestVigencia.dataFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataFim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtualizarComandaRequestVigencia {\n");

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

