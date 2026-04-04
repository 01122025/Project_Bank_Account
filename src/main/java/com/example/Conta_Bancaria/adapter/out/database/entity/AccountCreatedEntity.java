package com.example.Conta_Bancaria.adapter.out.database.entity;


import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table(name = "account", schema = "banco_test")
public class  AccountCreatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    @Column(name = "AGENCY", unique = true, nullable = false)
    private String agency;
    @Column(name = "BALANCE")
    private double balance;
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

// relacionamento entre as entiades
// lado inverso (opcional, mas recomendado)
    @OneToOne
    @JoinColumn(name = "account_holder_id", unique = true)
    private CreatedAccountEntity accountHolder;

    public AccountCreatedEntity() {

    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreatedAccountEntity getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(CreatedAccountEntity accountHolder) {
        this.accountHolder = accountHolder;
    }

    public AccountCreatedEntity(Long idAccount, String agency, double balance, TypeAccount typeAccount, LocalDateTime createdAt, CreatedAccountEntity accountHolder) {
        this.idAccount = idAccount;
        this.agency = agency;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.createdAt = createdAt;
        this.accountHolder = accountHolder;



    }
}
