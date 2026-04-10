package com.example.Conta_Bancaria.adapter.out.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accountholder", schema = "banco_test")
public class CreatedAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idHolder;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DOCUMENT")
    private String documentCpf;
    @Column(name = "EMAIL")
    private String email;

}
