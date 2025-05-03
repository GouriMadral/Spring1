package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@Column(name="AdminID",length=10)
	private String AdminID;
	
	@Column(name="Name",length=20)
	private String Name;
	
	@Column(name="ContactNo",length=20)
	private String ContactNo;
	
	@Column(name="EmailAddress",length=20)
	private String EmailAddress;
	
	//Default constructor
	public Admin() {
		super();
	}
	// Parameterized constructor
	public Admin(String adminID, String name, String contactNo, String emailAddress) {
		super();
		AdminID = adminID;
		Name = name;
		ContactNo = contactNo;
		EmailAddress = emailAddress;
	}
	// Getter and setter for AdminID
	public String getAdminID() {
		return AdminID;
	}
	public void setAdminID(String adminID) {
		AdminID = adminID;
	}
	// Getter and setter for Name
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	// Getter and setter for ContactNo
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	// Getter and setter for Email
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	// Override toString() method for displaying admin information
	@Override
	public String toString() {
		return "Admin [AdminID=" + AdminID + ", Name=" + Name + ", ContactNo=" + ContactNo + ", EmailAddress="
				+ EmailAddress + "]";
	}
}
