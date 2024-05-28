package net.nvsoftware.OrderServicecason.service;


import net.nvsoftware.OrderServicecason.client.PaymentServiceFeignClient;
import net.nvsoftware.OrderServicecason.client.ProductServiceFeignClient;
import net.nvsoftware.OrderServicecason.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;



@SpringBootTest
class OrderServiceImplTest {
    @Mock
    private OrderRepository orderRepository;
    @Mock
    private ProductServiceFeignClient productServiceFeignClient;
    @Mock
    private PaymentServiceFeignClient paymentServiceFeignClient;
    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    OrderService orderService = new OrderServiceImpl();

    @DisplayName("GetOrderDetailById - Success")
    @Test
    void testWhenGetOrderDetailByIdSuccess() {
        //Mock

        //Actual Call
        orderService.getOrderDetailById(1);

        //Verify Call

        //Assert Result
    }
}