package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@Column(name="OrderID",length=10)
	private String OrderID;
	@Column(name="CustomerID",length=20)
	private String CustomerID;
	@Column(name="OrderDate",length=20)
	private String OrderDate;
	@Column(name="OrderStatus",length=20)
	private String OrderStatus;
	@Column(name="Time",length=20)
	private String Time;
	@Column(name="Amount",length=20)
	private String Amount;

	//Default constructor
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Getter and setter for ID
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	// Getter and setter for CustomerID
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	
	// Getter and setter for Date
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	// Getter and setter for Order Status
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	// Getter and setter for time
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	// Getter and setter for Amount
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	// Parameterized constructor
	public Orders(String orderID, String customerID, String orderDate,
			String orderStatus, String time, String amount) {
		super();
		OrderID = orderID;
		CustomerID = customerID;
		OrderDate = orderDate;
		OrderStatus = orderStatus;
		Time = time;
		Amount = amount;
	}
	// Override toString() method for displaying Orders information
	@Override
	public String toString() {
		return "Orders [OrderID=" + OrderID + ", CustomerID=" + CustomerID +  ", OrderDate=" + OrderDate + ", OrderStatus=" + OrderStatus
				+ ", Time=" + Time + ", Amount=" + Amount + "]";
	}


}
