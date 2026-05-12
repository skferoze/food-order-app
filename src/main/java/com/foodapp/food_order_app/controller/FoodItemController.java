package com.foodapp.food_order_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foodapp.food_order_app.model.FoodItem;
import com.foodapp.food_order_app.service.FoodItemService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/add")
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {

        return foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/all")
    public List<FoodItem> getAllFoodItems() {

        return foodItemService.getAllFoodItems();
    }
}