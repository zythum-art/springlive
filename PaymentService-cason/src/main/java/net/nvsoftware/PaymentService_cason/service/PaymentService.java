package net.nvsoftware.PaymentService_cason.service;

import net.nvsoftware.PaymentService_cason.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
