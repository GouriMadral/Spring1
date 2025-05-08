package com.food.service;
import java.util.List;
import com.food.entity.Delivery_Boy;

public interface DeliveryBoyService {
	
	Delivery_Boy createDelivery_Boy(Delivery_Boy Delivery_Boy);	//Creates a new Delivery_Boy record in the database.
	Delivery_Boy getDelivery_Boy(String Delivery_BoyID); //Retrieves a list of all Delivery_Boy records from the database.
	List<Delivery_Boy> getAllDelivery_Boys(); // Fetches a single Delivery_Boy by its unique ID.
	Delivery_Boy updateDeliveryBoy(String dbId, Delivery_Boy dBoy); //Updates the details of an existing Delivery_Boy identified by Delivery_BoyID.
	String deleteDeliveryBoy(String id); //Deletes an Delivery_Boy record identified by Delivery_BoyID.
}
