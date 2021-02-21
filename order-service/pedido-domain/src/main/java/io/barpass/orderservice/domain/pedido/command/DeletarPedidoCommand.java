package io.barpass.orderservice.domain.pedido.command;

import java.util.UUID;

public class DeletarPedidoCommand {

   private UUID idPedido;

    public UUID getIdPedido() {
        return idPedido;
    }


    public static final class DeletarPedidoCommandBuilder {
        private UUID idPedido;

        private DeletarPedidoCommandBuilder() {
        }

        public static DeletarPedidoCommandBuilder builder() {
            return new DeletarPedidoCommandBuilder();
        }

        public DeletarPedidoCommandBuilder withIdPedido(UUID idPedido) {
            this.idPedido = idPedido;
            return this;
        }

        public DeletarPedidoCommand build() {
            DeletarPedidoCommand deletarPedidoCommand = new DeletarPedidoCommand();
            deletarPedidoCommand.idPedido = this.idPedido;
            return deletarPedidoCommand;
        }
    }
}
