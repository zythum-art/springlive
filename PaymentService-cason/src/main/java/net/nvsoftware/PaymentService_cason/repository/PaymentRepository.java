package net.nvsoftware.PaymentService_cason.repository;

import net.nvsoftware.PaymentService_cason.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    PaymentEntity findByOrderId(long orderId);
}
