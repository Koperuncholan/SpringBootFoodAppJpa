package com.nseit.SpringBootFoodAppJpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private int id;
    private int userId;
    private String restaurantName;
    private String restaurantLocation;
}
