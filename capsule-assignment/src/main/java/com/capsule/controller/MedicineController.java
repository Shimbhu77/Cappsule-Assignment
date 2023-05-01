package com.capsule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capsule.model.Medicine;
import com.capsule.service.MedicineService;

@RestController
public class MedicineController {

    @Autowired
    private MedicineService medService;

    @GetMapping("/medicine")
    public List<Medicine> getMedicine(@RequestParam("name") String name)
    {
   
        return medService.findByName(name);
  
    }

}

