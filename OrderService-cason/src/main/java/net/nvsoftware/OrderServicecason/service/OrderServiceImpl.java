package net.nvsoftware.OrderServicecason.service;

import lombok.extern.log4j.Log4j2;
import net.nvsoftware.OrderServicecason.entity.OrderEntity;
import net.nvsoftware.OrderServicecason.model.OrderRequest;
import net.nvsoftware.OrderServicecason.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public long placeOrder(OrderRequest orderRequest) {
        log.info("Start: OrderService placeOrder");
        // use OrderService to create OrderEntity with status CREATED, ORM JPA save to database
        OrderEntity orderEntity = OrderEntity.builder()
                .productId(orderRequest.getProductId())
                .quantity(orderRequest.getQuantity())
                .totalAmount(orderRequest.getTotalAmount())
                .orderDate(Instant.now())
                .orderStatus("CREATED")
                .build();
        orderRepository.save(orderEntity);
        log.info("Process: OrderService placeOrder save orderEntity with orderId: " + orderEntity.getId());
        // call ProductService to check product quantity, if ok, reduce it, else throw not enough
        // call PaymentService to charge, if Success, mark order PAID, else CANCELLED
        log.info("End: OrderService placeOrder");
        return orderEntity.getId();
    }
}
