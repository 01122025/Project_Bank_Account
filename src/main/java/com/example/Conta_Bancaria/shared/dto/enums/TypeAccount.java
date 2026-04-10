package com.example.Conta_Bancaria.shared.dto.enums;

public enum TypeAccount {
    POUPANCA("Conta Poupança"),
    CORRENTE("Conta Corrente");

    private String typeAccount;

    TypeAccount(String typeAccount){
        this.typeAccount = typeAccount;
    }
}
