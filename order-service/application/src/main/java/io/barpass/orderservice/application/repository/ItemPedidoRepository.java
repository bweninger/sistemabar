package io.barpass.orderservice.application.repository;

import io.barpass.orderservice.application.repository.entity.ItemPedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemPedidoRepository extends JpaRepository<ItemPedidoEntity, UUID> {
}
