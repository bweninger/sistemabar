package io.barpass.orderservice.application.repository;

import io.barpass.orderservice.application.repository.entity.ComandaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

public interface ComandaRepository extends JpaRepository<ComandaEntity, UUID> {

    @Query("SELECT c FROM ComandaEntity c WHERE c.dataInicioVigencia <= CURRENT_TIMESTAMP " +
            "AND (c.dataFimVigencia is null OR c.dataFimVigencia >= CURRENT_TIMESTAMP) " +
            "AND c.idUsuario = :idUsuario")
    Collection<ComandaEntity> listByUsuarioVigente(UUID idUsuario);

    @Query("select c from ComandaEntity c WHERE (c.idUsuario is null or c.idUsuario = :idUsuario) AND " +
            "(c.numeroComanda is null or c.numeroComanda = :numeroComanda) AND " +
            "(c.tipo is null or c.tipo = :tipoComanda) AND " +
            "c.dataInicioVigencia <= :dataVigencia AND (c.dataFimVigencia is null OR c.dataFimVigencia >= :dataVigencia) ")
    Collection<ComandaEntity> listByUsuarioNumeroVigenciaAndTipo(UUID idUsuario, Long numeroComanda, LocalDateTime dataVigencia,
                                                                 String tipoComanda);
}
