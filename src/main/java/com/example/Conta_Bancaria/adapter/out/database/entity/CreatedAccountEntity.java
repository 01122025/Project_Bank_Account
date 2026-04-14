package com.example.Conta_Bancaria.adapter.out.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    @Column(name = "name")
    private String name;
    @Column(name = "document")
    private String documentID;
    @Column(name = "email")
    private String email;


}
