package net.nvsoftware.OrderServicecason.service;

import net.nvsoftware.OrderServicecason.model.OrderRequest;
import net.nvsoftware.OrderServicecason.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetailById(long orderId);
}
