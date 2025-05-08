package com.food.service;
import java.util.List;
import com.food.entity.Categories;

public interface CategoriesService {
	
	Categories createCategories(Categories categories);	//Creates a new category record in the database.
	Categories getCategories(String catID); //Retrieves a list of all category records from the database.
	List<Categories> getAllCategories(); // Fetches a single category by its unique ID.
	Categories updateCategories(String catId, Categories categories); //Updates the details of an existing category identified by categoryID.
	String deleteCategories(String id); //Deletes an category record identified by categoryID.
}
