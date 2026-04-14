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
    @Column(name = "agency", unique = true, nullable = false)
    private String agency;
    @Column(name = "balance")
    private Double balance;
    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private TypeAccount typeAccount;
    @Column(name = "created_at")
    private LocalDateTime createdAt;


}
