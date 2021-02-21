package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;
import java.util.UUID;

/**
 * Representacao de uma Comanda
 */
@ApiModel(description = "Representacao de uma Comanda")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class ComandaResponse {

    @JsonProperty("idComanda")
    private UUID idComanda = null;

    @JsonProperty("idUsuario")
    private UUID idUsuario = null;

    @JsonProperty("vigencia")
    private ComandaResponseVigencia vigencia = null;

    @JsonProperty("pedidos")
    private PedidosResponseList pedidos = null;

    /**
     * id da comada
     *
     * @return idComanda
     **/
    @ApiModelProperty(value = "id da comada")
    public UUID getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(UUID idComanda) {
        this.idComanda = idComanda;
    }

    /**
     * id do usuario
     *
     * @return idUsuario
     **/
    @ApiModelProperty(value = "id do usuario")
    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Get vigencia
     *
     * @return vigencia
     **/
    @ApiModelProperty(value = "")
    @Valid
    public ComandaResponseVigencia getVigencia() {
        return vigencia;
    }

    public void setVigencia(ComandaResponseVigencia vigencia) {
        this.vigencia = vigencia;
    }

    public ComandaResponse pedidos(PedidosResponseList pedidos) {
        this.pedidos = pedidos;
        return this;
    }

    /**
     * Get pedidos
     *
     * @return pedidos
     **/
    @ApiModelProperty(value = "")

    @Valid

    public PedidosResponseList getPedidos() {
        return pedidos;
    }

    public void setPedidos(PedidosResponseList pedidos) {
        this.pedidos = pedidos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComandaResponse comandaResponse = (ComandaResponse) o;
        return Objects.equals(this.idComanda, comandaResponse.idComanda) &&
                Objects.equals(this.idUsuario, comandaResponse.idUsuario) &&
                Objects.equals(this.vigencia, comandaResponse.vigencia) &&
                Objects.equals(this.pedidos, comandaResponse.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComanda, idUsuario, vigencia, pedidos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComandaResponse {\n");

        sb.append("    idComanda: ").append(toIndentedString(idComanda)).append("\n");
        sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
        sb.append("    vigencia: ").append(toIndentedString(vigencia)).append("\n");
        sb.append("    pedidos: ").append(toIndentedString(pedidos)).append("\n");
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

