package com.example.Conta_Bancaria.shared.dto;

import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;

import java.time.LocalDateTime;



public class AccountDTO {
    private Long id;
    private String agency;
    private final Double balance;
    private Double amount;
    private TypeAccount typeAccount;
    private AccountHolderDTO accountHolderDTO;
    private LocalDateTime createdAt;


    public AccountDTO(Long id, String agency, Double balance, Double amount, TypeAccount typeAccount, AccountHolderDTO accountHolderDTO, LocalDateTime createdAt) {
        this.id = id;
        this.agency = agency;
        this.balance = balance;
        this.amount = amount;
        this.typeAccount = typeAccount;
        this.accountHolderDTO = accountHolderDTO;
        this.createdAt = createdAt;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public AccountHolderDTO getAccountHolderDTO() {
        return accountHolderDTO;
    }
    public Double getBalance() {
        return balance;
    }

    public void setAccountHolderDTO(AccountHolderDTO accountHolderDTO) {
        this.accountHolderDTO = accountHolderDTO;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

