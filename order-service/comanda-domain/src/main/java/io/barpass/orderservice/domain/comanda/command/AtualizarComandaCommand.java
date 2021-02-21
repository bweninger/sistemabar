package io.barpass.orderservice.domain.comanda.command;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class AtualizarComandaCommand {

    private UUID idComanda;

    private Instant dataFimVigencia;

    private UUID idUsuario;

    public UUID getIdComanda() {
        return idComanda;
    }

    public Optional<Instant> getDataFimVigencia() {
        return Optional.ofNullable(dataFimVigencia);
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }


    public static final class AtualizarComandaCommandBuilder {
        private UUID idComanda;
        private Instant dataFimVigencia;
        private UUID idUsuario;

        private AtualizarComandaCommandBuilder() {
        }

        public static AtualizarComandaCommandBuilder builder() {
            return new AtualizarComandaCommandBuilder();
        }

        public AtualizarComandaCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public AtualizarComandaCommandBuilder withDataFimVigencia(Instant dataFimVigencia) {
            this.dataFimVigencia = dataFimVigencia;
            return this;
        }

        public AtualizarComandaCommandBuilder withIdUsuario(UUID idUsuario) {
            this.idUsuario = idUsuario;
            return this;
        }

        public AtualizarComandaCommand build() {
            AtualizarComandaCommand atualizarComandaCommand = new AtualizarComandaCommand();
            atualizarComandaCommand.idComanda = this.idComanda;
            atualizarComandaCommand.dataFimVigencia = this.dataFimVigencia;
            atualizarComandaCommand.idUsuario = this.idUsuario;
            return atualizarComandaCommand;
        }
    }
}
