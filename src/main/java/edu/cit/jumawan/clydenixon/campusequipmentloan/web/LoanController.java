package edu.cit.jumawan.clydenixon.campusequipmentloan.web;

import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.LoanResponseDTO;
import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.ReturnLoanResponseDTO;
import edu.cit.jumawan.clydenixon.campusequipmentloan.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanService loanService;
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<LoanResponseDTO> createLoan(@RequestBody Object request) {
        return ResponseEntity.ok(loanService.createLoan(request));
    }

    @PostMapping("/{id}/return")
    public ResponseEntity<ReturnLoanResponseDTO> returnLoan(@PathVariable Long id) {
        return ResponseEntity.ok(loanService.returnLoan(id));
    }
}
