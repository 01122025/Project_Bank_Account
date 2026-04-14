package com.example.Conta_Bancaria.adapter.in;

import com.example.Conta_Bancaria.application.AccountService;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/deposit")
    public void deposit(
            @RequestBody AccountDTO accountDTO
    ){

            accountService.deposit(accountDTO, accountDTO.getAmount());
            log.info("Deposit processed: Number Account={}, amount={}", accountDTO.getId(), accountDTO.getAmount());

    }

    @PostMapping("/withdraw")
    public void withdraw(
            @RequestBody AccountDTO accountDTO
    ){

            accountService.withdraw(accountDTO, accountDTO.getAmount());
             log.info("Withdraw processed: Number Account={}, amount={}", accountDTO.getId(), accountDTO.getAmount());


    }


}