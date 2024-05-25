package net.nvsoftware.OrderServicecason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceCasonApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceCasonApplication.class, args);
	}

}
