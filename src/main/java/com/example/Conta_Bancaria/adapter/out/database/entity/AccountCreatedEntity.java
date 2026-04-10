package com.example.Conta_Bancaria.adapter.out.database.entity;


import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class  AccountCreatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idAccount;
    @Column(name = "AGENCY", unique = true, nullable = false)
    private String agency;
    @Column(name = "BALANCE")
    private Double balance;
    @Enumerated(EnumType.STRING)
    @Column(name = "ACCOUNT_TYPE")
    private TypeAccount typeAccount;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

// relacionamento entre as entiades
// lado inverso (opcional, mas recomendado)
    @OneToOne
    @JoinColumn(name = "account_holder_id", unique = true)
    private CreatedAccountEntity accountHolder;

}
