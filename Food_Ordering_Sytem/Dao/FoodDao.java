package com.food.Dao;
import java.util.List;
import com.food.entity.Food;

public interface FoodDao {
	
	Food createFood(Food food);	 //Creates a new food record in the database.
	Food getFood(String foodID); //Retrieves a list of all food records from the database
	List<Food> getAllFoods();  // Fetches a single food by its unique ID.
	Food updateFood(String fId, Food fd);  //Updates the details of an existing food identified by foodID.
	String deleteFood(String id);  //Deletes an food record identified by foodID.
}
