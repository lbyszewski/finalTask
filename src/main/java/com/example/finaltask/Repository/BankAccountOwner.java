package com.example.finaltask.Repository;

import com.example.finaltask.Entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountOwner extends JpaRepository<BankAccount, Long> {
}
