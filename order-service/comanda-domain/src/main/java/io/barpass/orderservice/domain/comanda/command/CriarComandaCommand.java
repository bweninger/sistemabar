package io.barpass.orderservice.domain.comanda.command;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class CriarComandaCommand {

    private UUID idUsuario;

    private Long numeroComanda;

    private Instant dataInicioVigencia;

    private String tipoComanda;

    public String getTipoComanda() {
        return tipoComanda;
    }

    public Optional<Long> getNumeroComanda() {
        return Optional.ofNullable(numeroComanda);
    }

    public Optional<UUID> getIdUsuario() {
        return Optional.ofNullable(idUsuario);
    }

    public Optional<Instant> getDataInicioVigencia() {
        return Optional.ofNullable(dataInicioVigencia);
    }


    public static final class CriarComandaCommandBuilder {
        private UUID idUsuario;
        private Long numeroComanda;
        private Instant dataInicioVigencia;
        private String tipoComanda;

        private CriarComandaCommandBuilder() {
        }

        public static CriarComandaCommandBuilder builder() {
            return new CriarComandaCommandBuilder();
        }

        public CriarComandaCommandBuilder withIdUsuario(UUID idUsuario) {
            this.idUsuario = idUsuario;
            return this;
        }

        public CriarComandaCommandBuilder withNumeroComanda(Long numeroComanda) {
            this.numeroComanda = numeroComanda;
            return this;
        }

        public CriarComandaCommandBuilder withDataInicioVigencia(Instant dataInicioVigencia) {
            this.dataInicioVigencia = dataInicioVigencia;
            return this;
        }

        public CriarComandaCommandBuilder withTipoComanda(String tipoComanda) {
            this.tipoComanda = tipoComanda;
            return this;
        }

        public CriarComandaCommand build() {
            CriarComandaCommand criarComandaCommand = new CriarComandaCommand();
            criarComandaCommand.numeroComanda = this.numeroComanda;
            criarComandaCommand.dataInicioVigencia = this.dataInicioVigencia;
            criarComandaCommand.idUsuario = this.idUsuario;
            criarComandaCommand.tipoComanda = this.tipoComanda;
            return criarComandaCommand;
        }
    }
}
