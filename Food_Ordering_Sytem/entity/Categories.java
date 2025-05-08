package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
	@Id
	@Column(name="ID",length=10)
	private String ID;
	@Column(name="Veg",length=10)
	private String Veg;
	@Column(name="Price",length=20)
	private String Price;

	//Default constructor
	public Categories() {
		super();
	}
	// Parameterized constructor
	public Categories(String id,String veg, String price) {
		super();
		ID=id;
		Veg = veg;
		Price = price;
	}
	// Getter and setter for ID
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	// Getter and setter for Veg
	public String getVeg() {
		return Veg;
	}
	public void setVeg(String veg) {
		Veg = veg;
	}
	// Getter and setter for Non-Veg
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	// Override toString() method for displaying category information
	@Override
	public String toString() {
		return "Categories [ID=" + ID + ", Veg/Non_Veg=" + Veg + ", Price=" + Price + "]";
	}

}
