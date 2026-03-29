package com.example.Conta_Bancaria.adapter.out.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accountholder", schema = "banco_test")
public class  CreatedAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHolder;
    @Column(name = "NOME_TITULAR")
    private String name;
    @Column(name = "CPF_TITULAR")
    private String documentCpf;
    @Column(name = "EMAIL_TITULAR")
    private String email;



}
