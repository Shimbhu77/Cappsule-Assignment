package com.capsule.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.model.Medicine;
import com.capsule.repository.MedicineRepository;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medRepo;

    @Override
    public List<Medicine> findByName(String name) {
        return medRepo.findByItemName(name);
    }

}
