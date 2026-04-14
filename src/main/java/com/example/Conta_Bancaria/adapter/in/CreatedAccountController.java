package com.example.Conta_Bancaria.adapter.in;

import com.example.Conta_Bancaria.application.CreatedAccount;
import com.example.Conta_Bancaria.shared.dto.AccountHolderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/createdAccount")
public class CreatedAccountController {

    private final CreatedAccount createdAccount;

    private CreatedAccountController (CreatedAccount createdAccount) {
        this.createdAccount = createdAccount;
    }

    @PostMapping("/accountCreated")
    public void createAccount(
            @RequestBody AccountHolderDTO accountHolderDTO
            ) {
       createdAccount.createAccount(accountHolderDTO);
       log.info("Account created successfully: Name={}, CPF={}", accountHolderDTO.getName(), accountHolderDTO.getDocumentID());
    }


}
