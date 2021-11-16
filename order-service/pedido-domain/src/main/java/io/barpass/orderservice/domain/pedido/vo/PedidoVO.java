package io.barpass.orderservice.domain.pedido.vo;

import io.barpass.orderservice.domain.pedido.entity.StatusPedido;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class PedidoVO {

    private UUID id;

    private UUID idComanda;

    private List<ItemPedidoVO> itens;

    private StatusPedido status;

    private LocalDateTime dataPedido;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(UUID idComanda) {
        this.idComanda = idComanda;
    }

    public List<ItemPedidoVO> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoVO> itens) {
        this.itens = itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
}
