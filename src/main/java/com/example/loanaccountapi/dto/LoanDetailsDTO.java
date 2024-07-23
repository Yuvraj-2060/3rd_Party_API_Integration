package com.example.loanaccountapi.dto;

import lombok.*;

@Data // This includes @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoanDetailsDTO {
    private String borrowerName;
    private String loanType;
    private int loanAmount;
    private double interestRate;
    private String loanStartDate;
    private String loanEndDate;
}
