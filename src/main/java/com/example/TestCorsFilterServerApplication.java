package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestCorsFilterServerApplication {

	@Bean
	public TomcatServletWebServerFactory tomcat() {
		TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory();
		tomcatFactory.setPort(8090); //默认启动8090端口
		return tomcatFactory;
	}

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestCorsFilterServerApplication.class, args);
	}

}
