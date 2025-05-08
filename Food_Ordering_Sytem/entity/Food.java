package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="Food_Details")

public class Food {
	@Id
	@Column(name="FoodID",length=10)
	private String FoodID;
	@Column(name="FoodName",length=20)
	private String FoodName;
	@Column(name="Price",length=20)
	private String Price;
	@Column(name="Description",length=50)
	private String Description;
	@Column(name="Quantity",length=20)
	private String Quantity;

	//Default constructor
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor
	public Food(String foodID, String foodName,String price,String description, String quantity) {
		super();
		FoodID = foodID;
		FoodName = foodName;
		Price = price;
		Description= description;
		Quantity=quantity;
	}
	// Getter and setter for ID
	public String getFoodID() {
		return FoodID;
	}
	public void setFoodID(String foodID) {
		FoodID = foodID;
	}
	// Getter and setter for Name
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	// Getter and setter for Price
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	// Getter and setter for Description
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	// Getter and setter for Quantity
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	// Override toString() method for displaying Food information
	@Override
	public String toString() {
		return "Food [FoodID=" + FoodID + ", FoodName=" + FoodName + ", Price=" + Price + ", Description=" + Description
				+ ", Quantity=" + Quantity + "]";
	}


}
