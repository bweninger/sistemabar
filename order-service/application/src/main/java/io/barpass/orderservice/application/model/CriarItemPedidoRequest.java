package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Objeto para criação de um item de pedido.
 */
@ApiModel(description = "Objeto para criação de um item de pedido.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class CriarItemPedidoRequest   {

  @JsonProperty("idProduto")
  private Object idProduto = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("quantidade")
  private Integer quantidade = null;

  public CriarItemPedidoRequest idProduto(Object idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * id do produto
   * @return idProduto
  **/
  @ApiModelProperty(required = true, value = "id do produto")
  @NotNull
  public Object getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(Object idProduto) {
    this.idProduto = idProduto;
  }

  public CriarItemPedidoRequest status(String status) {
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

  public CriarItemPedidoRequest quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  /**
   * quantidade de itens
   * @return quantidade
  **/
  @ApiModelProperty(required = true, value = "quantidade de itens")
  @NotNull
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
    CriarItemPedidoRequest criarItemPedidoRequest = (CriarItemPedidoRequest) o;
    return
        Objects.equals(this.idProduto, criarItemPedidoRequest.idProduto) &&
        Objects.equals(this.status, criarItemPedidoRequest.status) &&
        Objects.equals(this.quantidade, criarItemPedidoRequest.quantidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, status, quantidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriarItemPedidoRequest {\n");
    
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

