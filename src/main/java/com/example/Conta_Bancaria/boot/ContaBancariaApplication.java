package com.example.Conta_Bancaria.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@ComponentScan("com.example.Conta_Bancaria")
@EntityScan("com.example.Conta_Bancaria.adapter.out.database.entity")
@EnableJpaRepositories("com.example.Conta_Bancaria.adapter.out.database.repository")
@SpringBootApplication
public class ContaBancariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaBancariaApplication.class, args);
	}

}
