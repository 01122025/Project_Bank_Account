package com.example.Conta_Bancaria.adapter.out.database.repository;

import com.example.Conta_Bancaria.adapter.out.database.entity.CreatedAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatedAccountJpaRepository  extends JpaRepository<CreatedAccountEntity, Long> {
}
