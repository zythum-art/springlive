package net.nvsoftware.OrderServicecason.model;

import lombok.Data;

@Data
public class OrderRequest {
    private long productId;
    private long quantity;
    private long totalAmount;
    private String paymentMode;
}
