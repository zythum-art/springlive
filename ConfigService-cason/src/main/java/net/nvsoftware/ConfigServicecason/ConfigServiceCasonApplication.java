package net.nvsoftware.ConfigServicecason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceCasonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceCasonApplication.class, args);
	}

}
