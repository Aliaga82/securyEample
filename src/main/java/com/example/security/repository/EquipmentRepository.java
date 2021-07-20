package com.example.security.repository;

import com.example.security.domain.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<Equipment,Long> {
}
