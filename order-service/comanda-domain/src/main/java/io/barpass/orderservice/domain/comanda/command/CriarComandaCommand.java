package io.barpass.orderservice.domain.comanda.command;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class CriarComandaCommand {

    private UUID idComanda;

    private UUID idUsuario;

    private Instant dataInicioVigencia;

    public Optional<UUID> getIdComanda() {
        return Optional.ofNullable(idComanda);
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }

    public Optional<Instant> getDataInicioVigencia() {
        return Optional.ofNullable(dataInicioVigencia);
    }


    public static final class CriarComandaCommandBuilder {
        private UUID idComanda;
        private UUID idUsuario;
        private Instant dataInicioVigencia;

        private CriarComandaCommandBuilder() {
        }

        public static CriarComandaCommandBuilder builder() {
            return new CriarComandaCommandBuilder();
        }

        public CriarComandaCommandBuilder withIdComanda(UUID idComanda) {
            this.idComanda = idComanda;
            return this;
        }

        public CriarComandaCommandBuilder withIdUsuario(UUID idUsuario) {
            this.idUsuario = idUsuario;
            return this;
        }

        public CriarComandaCommandBuilder withDataInicioVigencia(Instant dataInicioVigencia) {
            this.dataInicioVigencia = dataInicioVigencia;
            return this;
        }

        public CriarComandaCommand build() {
            CriarComandaCommand criarComandaCommand = new CriarComandaCommand();
            criarComandaCommand.idUsuario = this.idUsuario;
            criarComandaCommand.idComanda = this.idComanda;
            criarComandaCommand.dataInicioVigencia = this.dataInicioVigencia;
            return criarComandaCommand;
        }
    }
}
