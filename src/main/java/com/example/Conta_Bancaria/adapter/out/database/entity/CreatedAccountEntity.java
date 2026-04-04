package com.example.Conta_Bancaria.adapter.out.database.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "accountholder", schema = "banco_test")
public class    CreatedAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHolder;
    @Column(name = "NOME_TITULAR")
    private String name;
    @Column(name = "CPF_TITULAR")
    private String documentCpf;
    @Column(name = "EMAIL_TITULAR")
    private String email;

    public CreatedAccountEntity(Long idHolder, String name, String documentCpf, String email) {
        this.idHolder = idHolder;
        this.name = name;
        this.documentCpf = documentCpf;
        this.email = email;
    }
    public CreatedAccountEntity() {}

    public Long getIdHolder() {
        return idHolder;
    }

    public void setIdHolder(Long idHolder) {
        this.idHolder = idHolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentCpf() {
        return documentCpf;
    }

    public void setDocumentCpf(String documentCpf) {
        this.documentCpf = documentCpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
