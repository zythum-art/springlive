package net.nvsoftware.ServiceRegistrycason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryCasonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryCasonApplication.class, args);
	}

}
