package net.nvsoftware.PaymentService_cason.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "Payment_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String paymentMode;
    private long totalAmount;
    private Instant paymentDate;
    private String paymentStatus;
}
