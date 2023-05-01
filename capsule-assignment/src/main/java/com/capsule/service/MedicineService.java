package com.capsule.service;

import java.util.List;


import com.capsule.model.Medicine;
public interface MedicineService {

    List<Medicine> findByName(String name);

}

