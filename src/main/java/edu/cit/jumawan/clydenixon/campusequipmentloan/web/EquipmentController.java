package edu.cit.jumawan.clydenixon.campusequipmentloan.web;

import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.EquipmentDTO;
import edu.cit.jumawan.clydenixon.campusequipmentloan.service.EquipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;
    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<EquipmentDTO>> getAvailableEquipment() {
        return ResponseEntity.ok(equipmentService.getAvailableEquipment());
    }
}
