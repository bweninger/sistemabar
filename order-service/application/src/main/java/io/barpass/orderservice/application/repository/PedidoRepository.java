package io.barpass.orderservice.application.repository;

import io.barpass.orderservice.application.repository.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface PedidoRepository extends JpaRepository<PedidoEntity, UUID> {

    Collection<PedidoEntity> findAllByComanda_Id(UUID idComanda);

}
