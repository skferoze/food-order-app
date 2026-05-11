package com.foodapp.food_order_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.food_order_app.model.Restaurant;
import com.foodapp.food_order_app.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant) {

        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {

        return restaurantRepository.findAll();
    }
}