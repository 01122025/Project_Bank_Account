package com.example.Conta_Bancaria.shared.dto;

import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;

import java.time.LocalDateTime;

public class AccountHolderDTO extends AccountDTO {
    private Long id;
    private String name;
    private String documentID;
    private String email;




    public AccountHolderDTO(Long id, String agency, Double balance, Double amount, TypeAccount typeAccount, AccountHolderDTO accountHolderDTO, LocalDateTime createdAt) {
        super(id, agency, balance, amount, typeAccount,accountHolderDTO ,createdAt);
        this.id = id;
        this.name = accountHolderDTO.name;
        this.documentID = accountHolderDTO.documentID;
        this.email = accountHolderDTO.email;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
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
