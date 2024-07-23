package com.example.loanaccountapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmiDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int emiNumber;
    private String dueDate;
    private int emiAmount;
    private String status;
    private String paymentDate;

    @ManyToOne
    @JoinColumn(name = "loan_account_number")
    private LoanAccount loanAccount;
}
