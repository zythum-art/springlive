package net.nvsoftware.OrderServicecason.service;

import net.nvsoftware.OrderServicecason.model.OrderRequest;
import net.nvsoftware.OrderServicecason.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public long placeOrder(OrderRequest orderRequest) {
        // use OrderService to create OrderEntity with status CREATED, ORM JPA save to database
        // call ProductService to check product quantity, if ok, reduce it, else throw not enough
        // call PaymentService to charge, if Success, mark order PAID, else CANCELLED
        return 0;
    }
}
