package com.example.Conta_Bancaria.adapter.in;

import com.example.Conta_Bancaria.application.AccountService;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getAccount")
public class AccountController {

//    private final CreatedAccount createdAccount;
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/deposito")
    public void deposit(
            @RequestBody AccountDTO accountDTO
    ){
        try{

            if(accountDTO.getAmount() == null){
                throw new IllegalArgumentException("Amount cannot be null");
            }
            accountService.deposit(accountDTO, accountDTO.getAmount());

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }


}