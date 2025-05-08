package com.food.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="Payment_Details")
public class Payment {
	@Id
	@Column(name="PaymentID",length=10)
	private String PaymentID;
	@Column(name="PaymentDate",length=10)
	private String PaymentDate;
	@Column(name="PaymentAmount",length=50)
	private String PaymentAmount;
	@Column(name="PaymentStatus",length=20)
	private String PaymentStatus;
	@Column(name="PaymentMethod",length=20)
	private String PaymentMethod;

	//Default constructor
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor
	public Payment(String paymentID, String paymentDate, String paymentAmount, String paymentStatus,
			String paymentMethod) {
		super();
		PaymentID = paymentID;
		PaymentDate = paymentDate;
		PaymentAmount = paymentAmount;
		PaymentStatus = paymentStatus;
		PaymentMethod = paymentMethod;
	}
	// Getter and setter for ID
	public String getPaymentID() {
		return PaymentID;
	}

	public void setPaymentID(String paymentID) {
		PaymentID = paymentID;
	}
	// Getter and setter for Date
	public String getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	// Getter and setter for amount
	public String getPaymentAmount() {
		return PaymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		PaymentAmount = paymentAmount;
	}
	// Getter and setter for status
	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	// Getter and setter for method
	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	// Override toString() method for displaying category information
	@Override
	public String toString() {
		return "Payment [PaymentID=" + PaymentID + ", PaymentDate=" + PaymentDate + ", PaymentAmount=" + PaymentAmount
				+ ", PaymentStatus=" + PaymentStatus + ", PaymentMethod=" + PaymentMethod + "]";
	}





}
