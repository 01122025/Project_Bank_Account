package com.example.Conta_Bancaria.boot.config;

import com.example.Conta_Bancaria.application.AccountService;
import com.example.Conta_Bancaria.application.CreatedAccount;
import com.example.Conta_Bancaria.application.service.AccountServiceRepository;
import com.example.Conta_Bancaria.application.service.CreatedAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountServiceConfig {

    @Bean
    public AccountService accountService(AccountServiceRepository accountServiceRepository){
        return new AccountService(accountServiceRepository);
    }
}
