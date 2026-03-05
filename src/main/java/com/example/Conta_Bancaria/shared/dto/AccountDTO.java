package com.example.Conta_Bancaria.shared.dto;

import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;

public class AccountDTO {
    private Long id;
    private String agency;
    private Double balance;
    private AccountHolderDTO accountHolderName;
    private TypeAccount accountType;



    public AccountDTO(Long id, String agency, Double balance, AccountHolderDTO accountHolderName, TypeAccount accountType) {
        this.id = id;
        this.agency = agency;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public TypeAccount getAccountType() {
        return accountType;
    }

    public void setAccountType(TypeAccount accountType) {
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountHolderDTO getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(AccountHolderDTO accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
