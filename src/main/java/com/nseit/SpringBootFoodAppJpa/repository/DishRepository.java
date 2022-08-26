package com.nseit.SpringBootFoodAppJpa.repository;

import com.nseit.SpringBootFoodAppJpa.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Integer> {
}
