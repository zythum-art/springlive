package net.nvsoftware.APIGateWay_cason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.data.keyvalue.core.mapping.KeySpaceResolver;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ApiGatewayCasonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayCasonApplication.class, args);
	}

	@Bean
	KeyResolver userIdSolver() {
		return exchange -> Mono.just("userId");
	}
}
