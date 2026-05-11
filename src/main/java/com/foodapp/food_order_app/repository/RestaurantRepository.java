package com.foodapp.food_order_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.foodapp.food_order_app.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}