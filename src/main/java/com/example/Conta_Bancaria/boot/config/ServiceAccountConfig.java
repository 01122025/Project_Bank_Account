package com.example.Conta_Bancaria.boot.config;


import com.example.Conta_Bancaria.application.AccountService;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceAccountConfig {

    @Bean
    public AccountService accountservice (AccountServiceRepository accountServiceRepository){
        return new AccountService(accountServiceRepository);
    }
}
