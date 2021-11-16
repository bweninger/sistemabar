package io.barpass.orderservice.domain.comanda.command;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class AtualizarComandaCommand {

    private UUID idComanda;

    private LocalDateTime dataInicioVigencia;

    private LocalDateTime dataFimVigencia;

    private UUID idUsuario;

    public UUID getIdComanda() {
        return idComanda;
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }

    public LocalDateTime getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public Optional<LocalDateTime> getDataFimVigencia() {
        return Optional.ofNullable(dataFimVigencia);
    }

    public static final class AtualizarComandaCommandBuilder {
        private UUID idComanda;
        private LocalDateTime dataInicioVigencia;
        private LocalDateTime dataFimVigencia;
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

        public AtualizarComandaCommandBuilder withDataInicioVigencia(LocalDateTime dataInicioVigencia) {
            this.dataInicioVigencia = dataInicioVigencia;
            return this;
        }

        public AtualizarComandaCommandBuilder withDataFimVigencia(LocalDateTime dataFimVigencia) {
            this.dataFimVigencia = dataFimVigencia;
            return this;
        }

        public AtualizarComandaCommandBuilder withIdUsuario(UUID idUsuario) {
            this.idUsuario = idUsuario;
            return this;
        }

        public AtualizarComandaCommand build() {
            AtualizarComandaCommand atualizarComandaCommand = new AtualizarComandaCommand();
            atualizarComandaCommand.dataInicioVigencia = this.dataInicioVigencia;
            atualizarComandaCommand.dataFimVigencia = this.dataFimVigencia;
            atualizarComandaCommand.idUsuario = this.idUsuario;
            atualizarComandaCommand.idComanda = this.idComanda;
            return atualizarComandaCommand;
        }
    }
}
