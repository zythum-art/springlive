package net.nvsoftware.OrderServicecason.service;

import net.nvsoftware.OrderServicecason.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
