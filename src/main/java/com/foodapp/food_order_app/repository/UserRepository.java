package com.foodapp.food_order_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.foodapp.food_order_app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}