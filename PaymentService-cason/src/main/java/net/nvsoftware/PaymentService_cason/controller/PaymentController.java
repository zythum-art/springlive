package net.nvsoftware.PaymentService_cason.controller;

import net.nvsoftware.PaymentService_cason.model.PaymentRequest;
import net.nvsoftware.PaymentService_cason.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/doPayment")
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest) {
        long paymentId = paymentService.doPayment(paymentRequest);
        return new ResponseEntity<>(paymentId, HttpStatus.OK);
    }
}
