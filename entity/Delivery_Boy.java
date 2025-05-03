package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="DeliveryBoy_Details")
public class Delivery_Boy {
	@Id
	@Column(name="DeliveryBoy_ID",length=10)
	private String DeliveryBoy_ID;

	@Column(name="Name",length=30)
	private String Name;
	
	@Column(name="ContactNo",length=20)
	private String ContactNo;

	
	//Default constructor
	public Delivery_Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor
	public Delivery_Boy(String deliveryID,  String name,String contactNo) {
		super();
		DeliveryBoy_ID = deliveryID;
		Name = name;
		ContactNo = contactNo;
		
	}
	// Getter and setter for ID
	public String getDeliveryBoy_ID() {
		return DeliveryBoy_ID;
	}

	public void setDeliveryBoy_ID(String deliveryID) {
		DeliveryBoy_ID = deliveryID;
	}
	// Getter and setter for Name
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
	// Getter and setter for contact no
	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	// Override toString() method for displaying delivery boy information
	@Override
	public String toString() {
		return "Delivery_Boy [DeliveryBoy_ID=" + DeliveryBoy_ID + ", Name=" + Name + ", ContactNo=" + ContactNo + "]";
	}
}
