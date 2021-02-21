package io.barpass.orderservice.domain.pedido.command;

import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;

import java.util.List;
import java.util.UUID;

public class AtualizarPedidoCommand {

    private UUID idPedido;

    private String status;

    private List<ItemPedidoVO> itens;

    private UUID idComanda;

    public UUID getIdPedido() {
        return idPedido;
    }

    public String getStatus() {
        return status;
    }

    public List<ItemPedidoVO> getItens() {
        return itens;
    }

    public UUID getIdComanda() {
        return idComanda;
    }


    public static final class AtualizarPedidoCommandBuilder {
        private UUID idPedido;
        private String status;
        private List<ItemPedidoVO> itens;
        private UUID idComanda;

        private AtualizarPedidoCommandBuilder() {
        }

        public static AtualizarPedidoCommandBuilder builder() {
            return new AtualizarPedidoCommandBuilder();
        }

        public AtualizarPedidoCommandBuilder withIdPedido(UUID idPedido) {
            this.idPedido = idPedido;
            return this;
        }

        public AtualizarPedidoCommandBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public AtualizarPedidoCommandBuilder withItens(List<ItemPedidoVO> itens) {
            this.itens = itens;
            return this;
        }

        public AtualizarPedidoCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public AtualizarPedidoCommand build() {
            AtualizarPedidoCommand atualizarPedidoCommand = new AtualizarPedidoCommand();
            atualizarPedidoCommand.idComanda = this.idComanda;
            atualizarPedidoCommand.itens = this.itens;
            atualizarPedidoCommand.status = this.status;
            atualizarPedidoCommand.idPedido = this.idPedido;
            return atualizarPedidoCommand;
        }
    }
}
