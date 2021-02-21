package io.barpass.orderservice.domain.comanda.command;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class AtualizarComandaCommand {

    private UUID idComanda;

    private Instant dataInicioVigencia;

    private Instant dataFimVigencia;

    private Instant dataVigencia;

    public Instant getDataVigencia() {
        return dataVigencia;
    }

    private UUID idUsuario;

    public UUID getIdComanda() {
        return idComanda;
    }

    public Instant getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public Optional<Instant> getDataFimVigencia() {
        return Optional.ofNullable(dataFimVigencia);
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }


    public static final class AtualizarComandaCommandBuilder {
        private UUID idComanda;
        private Instant dataInicioVigencia;
        private Instant dataFimVigencia;
        private Instant dataVigencia;
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

        public AtualizarComandaCommandBuilder withDataInicioVigencia(Instant dataInicioVigencia) {
            this.dataInicioVigencia = dataInicioVigencia;
            return this;
        }

        public AtualizarComandaCommandBuilder withDataFimVigencia(Instant dataFimVigencia) {
            this.dataFimVigencia = dataFimVigencia;
            return this;
        }

        public AtualizarComandaCommandBuilder withDataVigencia(Instant dataVigencia) {
            this.dataVigencia = dataVigencia;
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
            atualizarComandaCommand.dataInicioVigencia = this.dataInicioVigencia;
            atualizarComandaCommand.dataVigencia = this.dataVigencia;
            return atualizarComandaCommand;
        }
    }
}
