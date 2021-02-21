package io.barpass.orderservice.domain.comanda.command;

import java.util.UUID;

public class DeletarComandaCommand {

    private UUID idComanda;

    public UUID getIdComanda() {
        return idComanda;
    }

    public static final class DeletarComandaCommandBuilder {
        private UUID idComanda;

        private DeletarComandaCommandBuilder() {
        }

        public static DeletarComandaCommandBuilder builder() {
            return new DeletarComandaCommandBuilder();
        }

        public DeletarComandaCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public DeletarComandaCommand build() {
            DeletarComandaCommand deletarComandaCommand = new DeletarComandaCommand();
            deletarComandaCommand.idComanda = this.idComanda;
            return deletarComandaCommand;
        }
    }
}
