package com.food.Dao;
import java.util.List;
import com.food.entity.Payment;

public interface PaymentDao {
	
	Payment createPayment(Payment payment);	//Creates a new payment record in the database.
	Payment getPayment(String paymentID);  //Retrieves a list of all payment records from the database.
	List<Payment> getAllPayments();  // Fetches a single payment by its unique ID.
	Payment updatePayment(String pId, Payment pay); //Updates the details of an existing payment identified by paymentID.
	String deletePayment(String id); //Deletes an payment record identified by paymentID.
}
