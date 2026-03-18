package com.example.Conta_Bancaria.adapter.out.database.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreatedEntity {

    private Long idAccount;
    private String typeAccount;
    private Double balance;


}
