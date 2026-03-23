package com.example.Conta_Bancaria.adapter.out.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class  CreatedAccountEntity {

    private Long idHolder;
    private String name;
    private String documentCpf;
    private String email;


}
