package io.barpass.orderservice.domain.comanda.command;

import java.time.Instant;
import java.util.UUID;

public class DeletarComandaCommand {

    private UUID idComanda;

    private Instant dataVigencia;

    public UUID getIdComanda() {
        return idComanda;
    }

    public Instant getDataVigencia() {
        return dataVigencia;
    }

    public static final class DeletarComandaCommandBuilder {
        private UUID idComanda;
        private Instant dataVigencia;

        private DeletarComandaCommandBuilder() {
        }

        public static DeletarComandaCommandBuilder builder() {
            return new DeletarComandaCommandBuilder();
        }

        public DeletarComandaCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public DeletarComandaCommandBuilder withDataVigencia(Instant dataInicioVigencia) {
            this.dataVigencia = dataInicioVigencia;
            return this;
        }

        public DeletarComandaCommand build() {
            DeletarComandaCommand deletarComandaCommand = new DeletarComandaCommand();
            deletarComandaCommand.idComanda = this.idComanda;
            deletarComandaCommand.dataVigencia = this.dataVigencia;
            return deletarComandaCommand;
        }
    }
}
