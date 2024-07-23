package com.example.loanaccountapi.dto;

import lombok.*;

@Data // This includes @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmiDetailDTO {
    private int emiNumber;
    private String dueDate;
    private int emiAmount;
    private String status;
    private String paymentDate;
}
