package io.barpass.orderservice.domain.pedido.command;

import io.barpass.orderservice.domain.pedido.vo.ItemPedidoVO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CriarPedidoCommand {

    private UUID idComanda;

    private List<ItemPedidoVO> itens;

    public UUID getIdComanda() {
        return idComanda;
    }

    public List<ItemPedidoVO> getItens() {
        return itens;
    }

    public static final class CriarPedidoCommandBuilder {
        private UUID idComanda;
        private List<ItemPedidoVO> itens;

        private CriarPedidoCommandBuilder() {
        }

        public static CriarPedidoCommandBuilder builder() {
            return new CriarPedidoCommandBuilder();
        }

        public CriarPedidoCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public CriarPedidoCommandBuilder withItens(List<ItemPedidoVO> itens) {
            this.itens = itens;
            return this;
        }

        public CriarPedidoCommand build() {
            CriarPedidoCommand criarPedidoCommand = new CriarPedidoCommand();
            criarPedidoCommand.idComanda = this.idComanda;
            criarPedidoCommand.itens = this.itens;
            return criarPedidoCommand;
        }
    }
}
