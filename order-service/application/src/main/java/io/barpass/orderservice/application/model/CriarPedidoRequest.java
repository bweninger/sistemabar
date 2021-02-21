package io.barpass.orderservice.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Objeto para criação de um pedido.
 */
@ApiModel(description = "Objeto para criação de um pedido.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-04T12:54:47.972Z")
public class CriarPedidoRequest   {

  @JsonProperty("idComanda")
  private UUID idComanda = null;

  @JsonProperty("itemPedidos")
  @Valid
  private List<CriarItemPedidoRequest> itemPedidos = new ArrayList<CriarItemPedidoRequest>();

  /**
   * id da comanda
   * @return idComanda
  **/
  @ApiModelProperty(required = true, value = "id da comanda")
  @NotNull
  public UUID getIdComanda() {
    return idComanda;
  }

  public void setIdComanda(UUID idComanda) {
    this.idComanda = idComanda;
  }

  public CriarPedidoRequest addItemPedidosItem(CriarItemPedidoRequest itemPedidosItem) {
    this.itemPedidos.add(itemPedidosItem);
    return this;
  }

  /**
   * Get itemPedidos
   * @return itemPedidos
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<CriarItemPedidoRequest> getItemPedidos() {
    return itemPedidos;
  }

  public void setItemPedidos(List<CriarItemPedidoRequest> itemPedidos) {
    this.itemPedidos = itemPedidos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriarPedidoRequest criarPedidoRequest = (CriarPedidoRequest) o;
    return Objects.equals(this.idComanda, criarPedidoRequest.idComanda) &&
        Objects.equals(this.itemPedidos, criarPedidoRequest.itemPedidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idComanda, itemPedidos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriarPedidoRequest {\n");
    
    sb.append("    idComanda: ").append(toIndentedString(idComanda)).append("\n");
    sb.append("    itemPedidos: ").append(toIndentedString(itemPedidos)).append("\n");
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

