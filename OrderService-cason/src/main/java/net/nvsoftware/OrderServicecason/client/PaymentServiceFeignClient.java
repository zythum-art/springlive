package net.nvsoftware.OrderServicecason.client;

import net.nvsoftware.OrderServicecason.model.PaymentRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="PAYMENT-SERVICE/payment")
public interface PaymentServiceFeignClient {
    @PostMapping("/doPayment")
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);
}
