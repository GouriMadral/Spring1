package com.food.Dao;
import java.util.List;
import com.food.entity.Orders;

public interface OrdersDao {
	
	Orders createOrders(Orders orders);	//Creates a new orders record in the database.
	Orders getOrders(String orderID);  //Retrieves a list of all orders records from the database.
	List<Orders> getAllOrders();  // Fetches a single orders by its unique ID.
	Orders updateOrders(String oId, Orders order);  //Updates the details of an existing orders identified by ordersID.
	String deleteOrders(String id); //Deletes an orders record identified by ordersID.
}
