package com.example.loanaccountapi.repository;

import com.example.loanaccountapi.model.LoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanAccountRepository extends JpaRepository<LoanAccount, String> {
}
