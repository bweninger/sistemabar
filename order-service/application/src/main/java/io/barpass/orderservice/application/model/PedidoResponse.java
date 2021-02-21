package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representacao de um Pedido
 */
@ApiModel(description = "Representacao de um Pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class PedidoResponse   {
  @JsonProperty("idPedido")
  private String idPedido = null;

  @JsonProperty("idComanda")
  private Object idComanda = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("itemPedidos")
  @Valid
  private List<ItemPedidosResponseList> itemPedidos = null;

  @JsonProperty("dataPedido")
  private LocalDate dataPedido = null;

  public PedidoResponse idPedido(String idPedido) {
    this.idPedido = idPedido;
    return this;
  }

  /**
   * id do Pedido
   * @return idPedido
  **/
  @ApiModelProperty(value = "id do Pedido")


  public String getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(String idPedido) {
    this.idPedido = idPedido;
  }

  public PedidoResponse idComanda(Object idComanda) {
    this.idComanda = idComanda;
    return this;
  }

  /**
   * id da comanda
   * @return idComanda
  **/
  @ApiModelProperty(value = "id da comanda")


  public Object getIdComanda() {
    return idComanda;
  }

  public void setIdComanda(Object idComanda) {
    this.idComanda = idComanda;
  }

  public PedidoResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status do pedido
   * @return status
  **/
  @ApiModelProperty(value = "status do pedido")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PedidoResponse itemPedidos(List<ItemPedidosResponseList> itemPedidos) {
    this.itemPedidos = itemPedidos;
    return this;
  }

  public PedidoResponse addItemPedidosItem(ItemPedidosResponseList itemPedidosItem) {
    if (this.itemPedidos == null) {
      this.itemPedidos = new ArrayList<ItemPedidosResponseList>();
    }
    this.itemPedidos.add(itemPedidosItem);
    return this;
  }

  /**
   * Get itemPedidos
   * @return itemPedidos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemPedidosResponseList> getItemPedidos() {
    return itemPedidos;
  }

  public void setItemPedidos(List<ItemPedidosResponseList> itemPedidos) {
    this.itemPedidos = itemPedidos;
  }

  public PedidoResponse dataPedido(LocalDate dataPedido) {
    this.dataPedido = dataPedido;
    return this;
  }

  /**
   * Get dataPedido
   * @return dataPedido
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDataPedido() {
    return dataPedido;
  }

  public void setDataPedido(LocalDate dataPedido) {
    this.dataPedido = dataPedido;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoResponse pedidoResponse = (PedidoResponse) o;
    return Objects.equals(this.idPedido, pedidoResponse.idPedido) &&
        Objects.equals(this.idComanda, pedidoResponse.idComanda) &&
        Objects.equals(this.status, pedidoResponse.status) &&
        Objects.equals(this.itemPedidos, pedidoResponse.itemPedidos) &&
        Objects.equals(this.dataPedido, pedidoResponse.dataPedido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPedido, idComanda, status, itemPedidos, dataPedido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoResponse {\n");
    
    sb.append("    idPedido: ").append(toIndentedString(idPedido)).append("\n");
    sb.append("    idComanda: ").append(toIndentedString(idComanda)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    itemPedidos: ").append(toIndentedString(itemPedidos)).append("\n");
    sb.append("    dataPedido: ").append(toIndentedString(dataPedido)).append("\n");
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

