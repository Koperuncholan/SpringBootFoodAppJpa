package com.nseit.SpringBootFoodAppJpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.sql.Time;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int orderId;
    private String dishName;
    private Date date;
    private Time time;
}
