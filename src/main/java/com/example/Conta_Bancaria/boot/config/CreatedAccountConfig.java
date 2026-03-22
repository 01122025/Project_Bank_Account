package com.example.Conta_Bancaria.boot.config;

import com.example.Conta_Bancaria.application.CreatedAccount;
import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatedAccountConfig {
    @Bean
    public CreatedAccount creaatedAccount (CreatedAccountRepository createdAccountRepository){
        return new CreatedAccount(createdAccountRepository);
    }
}
