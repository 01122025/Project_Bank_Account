package com.example.Conta_Bancaria.shared.dto;

import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;

public class AccountHolderDTO extends AccountDTO {
    private String name;
    private String documentID;
    private String email;

    public AccountHolderDTO(Long id, String agency, Double balance, AccountHolderDTO accountHolderName, TypeAccount accountType, String name, String documentID, String email) {
        super(id, agency, balance, accountHolderName, accountType);
        this.name = name;
        this.documentID = documentID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
