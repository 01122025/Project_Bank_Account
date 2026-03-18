package com.example.Conta_Bancaria.adapter.out.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreatedAccountEntity {

    private Long idHolder;

    private String nameAccountHolder;

    private LocalDateTime createdDate;

}
