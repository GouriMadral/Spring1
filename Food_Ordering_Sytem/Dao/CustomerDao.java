package com.food.Dao;
import java.util.List;
import com.food.entity.Customer;

public interface CustomerDao {
	
	Customer createCustomer(Customer customer);	//Creates a new customer record in the database.
	List<Customer> getAllCustomer(); //Retrieves a list of all customer records from the database.
	Customer getCustomer(String customerID); // Fetches a single customer by its unique ID.
	Customer updatecustomer(String customerID,Customer updatedCustomer); //Updates the details of an existing customer identified by customerID.
	String deleteCustomer(String customerID); //Deletes an customer record identified by customerID.

}
