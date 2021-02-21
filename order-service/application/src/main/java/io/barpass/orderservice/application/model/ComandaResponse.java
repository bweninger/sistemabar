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

    @JsonProperty("numeroComanda")
    private Long numeroComanda;

    @JsonProperty("tipoComanda")
    private String tipoComanda;

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
    @ApiModelProperty(value = "Vigencia da Comanda")
    @Valid
    public ComandaResponseVigencia getVigencia() {
        return vigencia;
    }

    public void setVigencia(ComandaResponseVigencia vigencia) {
        this.vigencia = vigencia;
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

    @ApiModelProperty(value = "Numero da Comanda Fisica")
    public Long getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(Long numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    @ApiModelProperty(value = "Tipo da Comanda")
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
        ComandaResponse that = (ComandaResponse) o;
        return Objects.equals(idComanda, that.idComanda) &&
                Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(numeroComanda, that.numeroComanda) &&
                Objects.equals(tipoComanda, that.tipoComanda) &&
                Objects.equals(vigencia, that.vigencia) &&
                Objects.equals(pedidos, that.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComanda, idUsuario, numeroComanda, tipoComanda, vigencia, pedidos);
    }

    @Override
    public String toString() {
        return "ComandaResponse{" +
                "idComanda=" + idComanda +
                ", idUsuario=" + idUsuario +
                ", numeroComanda=" + numeroComanda +
                ", tipoComanda='" + tipoComanda + '\'' +
                ", vigencia=" + vigencia +
                ", pedidos=" + pedidos +
                '}';
    }
}

