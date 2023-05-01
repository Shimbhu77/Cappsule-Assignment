package com.capsule.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medicine")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {

    @Id
    private String productId;
    
    private String itemName;

    private String composition;

    private String manufacturer;

    private String packing;


}

