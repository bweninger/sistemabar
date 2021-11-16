package io.barpass.orderservice.domain.pedido.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class ItemPedido {

    private UUID id;

    @NotNull
    private UUID idPedido;

    @NotNull
    private UUID idProduto;

    @Min(1)
    private Long quantidade;

    @NotNull
    private StatusPedido status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(UUID idPedido) {
        this.idPedido = idPedido;
    }

    public UUID getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(UUID idProduto) {
        this.idProduto = idProduto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public ItemPedido(UUID id, UUID idPedido, UUID idProduto, Long quantidade, StatusPedido status) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.status = status;
    }

    public ItemPedido() {
    }
}
