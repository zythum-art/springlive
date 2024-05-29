package net.nvsoftware.OrderServicecason.service;


import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class OrderServiceTestConfig {
    @Bean
    public ServiceInstanceListSupplierTest supplier() {
        return new ServiceInstanceListSupplierTest();
    }
}
