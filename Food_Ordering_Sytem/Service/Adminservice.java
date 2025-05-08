package com.food.service;
import java.util.List;
import com.food.entity.Admin;

public interface Adminservice {
	
	Admin createAdmin(Admin admin);	//Creates a new Admin record in the database.
	List<Admin> getAllAdmin();  //Retrieves a list of all Admin records from the database.
	Admin getAdmin(String adminID); // Fetches a single Admin by its unique ID.
	Admin updateAdmin(String adminID,Admin updatedAdmin);  //Updates the details of an existing Admin identified by adminID.
	String deleteAdmin(String adminID);  //Deletes an Admin record identified by adminID.
}
