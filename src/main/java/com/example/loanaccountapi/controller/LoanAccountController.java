package com.example.loanaccountapi.controller;

import com.example.loanaccountapi.dto.LoanAccountResponse;
import com.example.loanaccountapi.service.LoanAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/loanaccounts")
public class LoanAccountController {

    @Autowired
    private LoanAccountService loanAccountService;

    @GetMapping("/{accountNumber}")
    public LoanAccountResponse getLoanAccountDetails(@PathVariable String accountNumber) {
        return loanAccountService.getLoanAccountDetails(accountNumber);
    }
}