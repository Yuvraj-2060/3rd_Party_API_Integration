package com.example.loanaccountapi.dto;

import lombok.*;

import java.util.List;

@Data // This includes @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoanAccountResponse {
    private String loanAccountNumber;
    private LoanDetailsDTO loanDetails;
    private List<EmiDetailDTO> emiDetails;
    private int totalDue;
    private String nextDueDate;
}
