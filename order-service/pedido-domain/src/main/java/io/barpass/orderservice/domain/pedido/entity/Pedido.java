package io.barpass.orderservice.domain.pedido.entity;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Pedido {

    private UUID id;

    private UUID idComanda;

    private Instant dataPedido;

    private List<ItemPedido> itens;

    private StatusPedido status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Instant dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public UUID getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(UUID idComanda) {
        this.idComanda = idComanda;
    }
}
