package edu.cit.jumawan.clydenixon.campusequipmentloan.service;

import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.LoanResponseDTO;
import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.ReturnLoanResponseDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LoanService {

    public LoanResponseDTO createLoan(Object request) {
        LoanResponseDTO dto = new LoanResponseDTO();
        dto.setId(1L);
        dto.setEquipmentName("Projector");
        dto.setStudentName("John Doe");
        dto.setStartDate(LocalDate.now());
        dto.setDueDate(LocalDate.now().plusDays(7));
        return dto;
    }

    public ReturnLoanResponseDTO returnLoan(Long id) {
        ReturnLoanResponseDTO dto = new ReturnLoanResponseDTO();
        dto.setLoanId(id);
        dto.setStatus("Returned");
        dto.setReturnDate(LocalDate.now());
        return dto;
    }
}
