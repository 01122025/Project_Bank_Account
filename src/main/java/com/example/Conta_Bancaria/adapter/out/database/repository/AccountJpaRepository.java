package com.example.Conta_Bancaria.adapter.out.database.repository;

import com.example.Conta_Bancaria.adapter.out.database.entity.AccountCreatedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountJpaRepository extends JpaRepository <AccountCreatedEntity, Long> {
}
