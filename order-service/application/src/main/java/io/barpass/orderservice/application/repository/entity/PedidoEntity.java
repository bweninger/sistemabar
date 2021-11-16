package io.barpass.orderservice.application.repository.entity;

import io.barpass.commons.domain.dataprovider.WithId;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pedido")
public class PedidoEntity implements WithId<UUID> {

    @Id
    private UUID id;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_comanda")
    private ComandaEntity comanda;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedidoEntity> itens;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComandaEntity getComanda() {
        return comanda;
    }

    public void setComanda(ComandaEntity comanda) {
        this.comanda = comanda;
    }

    public List<ItemPedidoEntity> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoEntity> itens) {
        this.itens = itens;
    }
}
