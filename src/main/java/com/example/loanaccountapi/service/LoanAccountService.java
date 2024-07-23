package com.example.loanaccountapi.service;

import com.example.loanaccountapi.dto.EmiDetailDTO;
import com.example.loanaccountapi.dto.LoanAccountResponse;
import com.example.loanaccountapi.dto.LoanDetailsDTO;
import com.example.loanaccountapi.exception.ResourceNotFoundException;
import com.example.loanaccountapi.model.EmiDetail;
import com.example.loanaccountapi.model.LoanAccount;
import com.example.loanaccountapi.model.LoanDetails;
import com.example.loanaccountapi.repository.LoanAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class LoanAccountService {
    @Autowired
    private LoanAccountRepository loanAccountRepository;

    @Autowired
    private RestTemplate restTemplate;

    private final String EXTERNAL_API_URL = "http://demo0951179.mockable.io/loanaccount/";

    public LoanAccountResponse getLoanAccountDetails(String accountNumber){
        ResponseEntity<LoanAccount> response = restTemplate.getForEntity(EXTERNAL_API_URL + accountNumber, LoanAccount.class);
        LoanAccount loanAccount = response.getBody();

        if(loanAccount==null){
            throw  new ResourceNotFoundException("LoanAccount Not found With Id: "+accountNumber);
        }
        // Save to database
        loanAccountRepository.save(loanAccount);

        // Transform to required response format
        return new LoanAccountResponse(
                loanAccount.getLoanAccountNumber(),
                convertToDTO(loanAccount.getLoanDetails()),
                convertToDTO(loanAccount.getEmiDetails()),
                loanAccount.getTotalDue(),
                loanAccount.getNextDueDate()
        );
    }

    private LoanDetailsDTO convertToDTO(LoanDetails loanDetails) {
        return new LoanDetailsDTO(
                loanDetails.getBorrowerName(),
                loanDetails.getLoanType(),
                loanDetails.getLoanAmount(),
                loanDetails.getInterestRate(),
                loanDetails.getLoanStartDate(),
                loanDetails.getLoanEndDate()
        );
    }

    private List<EmiDetailDTO> convertToDTO(List<EmiDetail> emiDetails) {
        return emiDetails.stream()
                .map(emi -> new EmiDetailDTO(
                        emi.getEmiNumber(),
                        emi.getDueDate(),
                        emi.getEmiAmount(),
                        emi.getStatus(),
                        emi.getPaymentDate()
                ))
                .collect(Collectors.toList());
    }
}