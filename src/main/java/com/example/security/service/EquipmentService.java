package com.example.security.service;

import com.example.security.domain.Equipment;
import com.example.security.repository.EquipmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;

    public Equipment save (Equipment equipment){
        for (int i=1; i<=equipment.getSay(); i++){
            equipmentRepository.save(equipment);
        }
        return equipmentRepository.save(equipment);
    }
}
