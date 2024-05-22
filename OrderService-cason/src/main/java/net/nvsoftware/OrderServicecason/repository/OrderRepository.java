package net.nvsoftware.OrderServicecason.repository;

import net.nvsoftware.OrderServicecason.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
