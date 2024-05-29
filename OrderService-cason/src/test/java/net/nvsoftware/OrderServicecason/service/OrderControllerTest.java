package net.nvsoftware.OrderServicecason.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EnableConfigurationProperties
@ContextConfiguration(classes = OrderServiceTestConfig.class)
public class OrderControllerTest {
    
}
