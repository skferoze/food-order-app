package com.foodapp.food_order_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodOrderAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(FoodOrderAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderAppApplication.class, args);
		logger.info("Food Order Application started successfully");
	}

}
