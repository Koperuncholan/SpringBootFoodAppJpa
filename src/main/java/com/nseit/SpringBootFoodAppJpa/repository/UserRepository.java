package com.nseit.SpringBootFoodAppJpa.repository;

import com.nseit.SpringBootFoodAppJpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
