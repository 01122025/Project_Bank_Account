package com.example.Conta_Bancaria.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountHolderDTO extends AccountDTO {
    private Long id;
    private String name;
    private String documentID;
    private String email;


}
