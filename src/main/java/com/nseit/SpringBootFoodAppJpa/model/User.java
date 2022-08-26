package com.nseit.SpringBootFoodAppJpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String userLocation;
    private long phoneNumber;
}
