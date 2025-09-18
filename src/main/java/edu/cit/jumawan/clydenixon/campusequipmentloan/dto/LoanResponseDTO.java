package edu.cit.jumawan.clydenixon.campusequipmentloan.dto;

import java.time.LocalDate;

public class LoanResponseDTO {
    private Long id;
    private String equipmentName;
    private String studentName;
    private LocalDate startDate;
    private LocalDate dueDate;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEquipmentName() { return equipmentName; }
    public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}
