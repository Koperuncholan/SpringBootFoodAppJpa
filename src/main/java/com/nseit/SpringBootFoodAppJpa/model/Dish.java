package com.nseit.SpringBootFoodAppJpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private int dishId;
    private int restaurantId;
    private String dishName;
    private int price;
    private String image;
}
