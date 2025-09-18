package edu.cit.jumawan.clydenixon.campusequipmentloan.service;

import edu.cit.jumawan.clydenixon.campusequipmentloan.dto.EquipmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipmentService {

    private final List<EquipmentDTO> equipmentList = new ArrayList<>();

    public EquipmentService() {
        equipmentList.add(new EquipmentDTO(1L, "Projector", true));
        equipmentList.add(new EquipmentDTO(2L, "Laptop", false));
        equipmentList.add(new EquipmentDTO(3L, "HDMI Cable", true));
    }

    public List<EquipmentDTO> getAvailableEquipment() {
        List<EquipmentDTO> available = new ArrayList<>();
        for (EquipmentDTO eq : equipmentList) {
            if (eq.isAvailable()) {
                available.add(eq);
            }
        }
        return available;
    }
}
