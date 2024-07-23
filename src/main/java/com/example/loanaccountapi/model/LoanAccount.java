package com.example.loanaccountapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccount {

    @Id
    private String loanAccountNumber;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loan_details_id")
    private LoanDetails loanDetails;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "loanAccount")
    private List<EmiDetail> emiDetails;

    private int totalDue;
    private String nextDueDate;
}
