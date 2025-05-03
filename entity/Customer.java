package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name="CustomerID",length=10)
	private String CustomerID;

	@Column(name="Name",length=30)
	private String Name;

	@Column(name="ContactNo",length=20)
	private String ContactNo;
	
	@Column(name="Email_ID",length=30)
	private String Email_ID;

	@Column(name="Address",length=30)
	private String Address;

	
	// Getter and setter for ID
	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	// Getter and setter for Name
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
	// Getter and setter for Contact No
	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	// Getter and setter for email
	public String getEmail_ID() {
		return Email_ID;
	}

	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	// Getter and setter for Address
		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}
	// Parameterized constructor
	public Customer(String customerID, String name,String contactNo,String email_ID,String address) {
		super();
		CustomerID = customerID;
		Name = name;
		ContactNo = contactNo;
		Email_ID = email_ID;
		Address=address;
	}
	//Default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Override toString() method for displaying customer information

	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", Name=" + Name + ", ContactNo=" + ContactNo + ", Email_ID="
				+ Email_ID + ", Address=" + Address + "]";
	}
}
