package com.example.Conta_Bancaria.shared.dto;

import com.example.Conta_Bancaria.shared.dto.enums.TypeAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDTO {
    private Long id;
    private String agency;
    private BigDecimal balance;
    private AccountHolderDTO accountHolderName;
    private TypeAccount accountType;
    private LocalDateTime createdAt;

}

