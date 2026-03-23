package com.example.Conta_Bancaria.shared.dto.enums;

public enum TypeAccount {
    ACCOUNT_SAVINGS("Conta Poupança"),
    ACCOUNT_CURRENT("Conta Corrente");

    private String typeAccount;

    TypeAccount(String typeAccount){
        this.typeAccount = typeAccount;
    }
}
