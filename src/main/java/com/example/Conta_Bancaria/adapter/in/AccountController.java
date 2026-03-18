package com.example.Conta_Bancaria.adapter.in;

import com.example.Conta_Bancaria.application.AccountService;
import com.example.Conta_Bancaria.application.CreatedAccount;
import com.example.Conta_Bancaria.shared.dto.AccountDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

   private final CreatedAccount createdAccount;
   private final AccountService accountService;

   @PostMapping
   public ResponseEntity<Void> createdAccount(
           @RequestHeader("Authorization") String user,
           @RequestBody AccountDTO AccountDTO){

            try {
                createdAccount.createdAccount(AccountDTO);

            }catch(Exception e){
                log.error("Error ao criar account {} para o usuario {}", AccountDTO.getAccountHolderName(),AccountDTO.getAccountHolderName() );
                e.printStackTrace();
            }

                return  ResponseEntity.status(HttpStatus.CREATED).build();
   }

    @PostMapping("/deposit")
    public ResponseEntity<Void> depositAccount(
            @RequestHeader("Authorization") String user,
            @RequestBody AccountDTO accountDTO) {

        try {
            accountService.depositAcount(accountDTO.getId(), accountDTO.getBalance());
            log.info("Deposito feito com sucesso");

        } catch (Exception e) {
            e.getMessage();
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/withdrawAcount")
    public ResponseEntity<Void> withdrawAccount(
            @RequestHeader("Authorization") String user,
            @RequestBody AccountDTO accountDTO) {
        try {

            if (accountDTO.getBalance() > 0) {
                accountService.withdrawAcount(accountDTO.getId(), accountDTO.getBalance());
                log.info("Deposito feito com sucesso");

            }
        } catch (Exception e) {
            e.getMessage();
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
