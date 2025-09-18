package edu.cit.jumawan.clydenixon.campusequipmentloan.dto;

import java.time.LocalDate;

public class ReturnLoanResponseDTO {
    private Long loanId;
    private String status;
    private LocalDate returnDate;
    
    public Long getLoanId() { return loanId; }
    public void setLoanId(Long loanId) { this.loanId = loanId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
}
