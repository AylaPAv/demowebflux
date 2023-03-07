package es.aylait.demowebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"es.aylait.demowebflux","es.aylait.demowebflux.controller",
		"es.aylait.demowebflux.domain","es.aylait.demowebflux.repository"})
public class DemowebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowebfluxApplication.class, args);
	}

}
