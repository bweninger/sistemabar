package io.barpass.orderservice.application.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Representacao de um Item de Pedido
 */
@ApiModel(description = "Representacao de um Item de Pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")




public class ItemPedidoResponse   {
  @JsonProperty("idItemPedido")
  private String idItemPedido = null;

  @JsonProperty("idPedido")
  private String idPedido = null;

  @JsonProperty("idProduto")
  private Object idProduto = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("quantidade")
  private Integer quantidade = null;

  public ItemPedidoResponse idItemPedido(String idItemPedido) {
    this.idItemPedido = idItemPedido;
    return this;
  }

  /**
   * id do Item Pedido
   * @return idItemPedido
  **/
  @ApiModelProperty(value = "id do Item Pedido")


  public String getIdItemPedido() {
    return idItemPedido;
  }

  public void setIdItemPedido(String idItemPedido) {
    this.idItemPedido = idItemPedido;
  }

  public ItemPedidoResponse idPedido(String idPedido) {
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

  public ItemPedidoResponse idProduto(Object idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * id do produto
   * @return idProduto
  **/
  @ApiModelProperty(value = "id do produto")


  public Object getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(Object idProduto) {
    this.idProduto = idProduto;
  }

  public ItemPedidoResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status do item pedido
   * @return status
  **/
  @ApiModelProperty(value = "status do item pedido")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ItemPedidoResponse quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  /**
   * quantidade de itens
   * @return quantidade
  **/
  @ApiModelProperty(value = "quantidade de itens")


  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPedidoResponse itemPedidoResponse = (ItemPedidoResponse) o;
    return Objects.equals(this.idItemPedido, itemPedidoResponse.idItemPedido) &&
        Objects.equals(this.idPedido, itemPedidoResponse.idPedido) &&
        Objects.equals(this.idProduto, itemPedidoResponse.idProduto) &&
        Objects.equals(this.status, itemPedidoResponse.status) &&
        Objects.equals(this.quantidade, itemPedidoResponse.quantidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idItemPedido, idPedido, idProduto, status, quantidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPedidoResponse {\n");
    
    sb.append("    idItemPedido: ").append(toIndentedString(idItemPedido)).append("\n");
    sb.append("    idPedido: ").append(toIndentedString(idPedido)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
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

