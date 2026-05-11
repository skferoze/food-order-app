package com.foodapp.food_order_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foodapp.food_order_app.model.Restaurant;
import com.foodapp.food_order_app.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {

        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {

        return restaurantService.getAllRestaurants();
    }
}