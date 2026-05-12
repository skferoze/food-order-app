package com.foodapp.food_order_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.food_order_app.model.FoodItem;
import com.foodapp.food_order_app.repository.FoodItemRepository;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    public FoodItem addFoodItem(FoodItem foodItem) {

        return foodItemRepository.save(foodItem);
    }

    public List<FoodItem> getAllFoodItems() {

        return foodItemRepository.findAll();
    }
}