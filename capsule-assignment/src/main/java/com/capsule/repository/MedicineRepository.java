package com.capsule.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capsule.model.Medicine;




@Repository
public interface MedicineRepository extends JpaRepository<Medicine, String>{
    
    List<Medicine> findByItemName(String itemName);
}


