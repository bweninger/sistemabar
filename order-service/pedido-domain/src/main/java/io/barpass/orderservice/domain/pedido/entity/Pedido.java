package io.barpass.orderservice.domain.pedido.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Pedido {

    private UUID id;

    @NotNull
    private UUID idComanda;

    @NotNull
    private LocalDateTime dataPedido;

    @NotEmpty
    private List<ItemPedido> itens;

    @NotNull
    private StatusPedido status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
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
