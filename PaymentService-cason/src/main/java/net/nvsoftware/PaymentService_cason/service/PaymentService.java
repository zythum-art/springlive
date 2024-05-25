package net.nvsoftware.PaymentService_cason.service;

import net.nvsoftware.PaymentService_cason.model.PaymentRequest;
import net.nvsoftware.PaymentService_cason.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailByOrderId(long orderId);
}
