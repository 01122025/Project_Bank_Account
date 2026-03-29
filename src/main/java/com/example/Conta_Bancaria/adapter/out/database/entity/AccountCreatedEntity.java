package com.example.Conta_Bancaria.adapter.out.database.entity;


import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account", schema = "banco_test")
public class  AccountCreatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    @Column(name = "AGENCY")
    private String agency;
    @Column(name = "BALANCE")
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

// relacionamento entre as entiades
// lado inverso (opcional, mas recomendado)
    @OneToOne
    @JoinColumn(name = "account_holder_id", unique = true)
    private CreatedAccountEntity accountHolder;
}
