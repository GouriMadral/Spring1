package com.food;
import java.util.Scanner;

public class MainOperation {
	static Scanner sc = new Scanner(System.in);
	private static boolean isLoggedIn = false; // Flag to track login attempts
	private static final String ADMIN_USERNAME = "admin"; // Replace with your desired username
	private static final String ADMIN_PASSWORD = "password"; // Replace with your desired password
	
	public static void mainOps() {
		// Login Section
		while (!isLoggedIn) {
			System.out.println("====Admin Login ====");
			System.out.print("Enter Admin name: ");
			String username = sc.nextLine();
			System.out.print("Enter Password: ");
			String password = sc.nextLine();

			if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
				System.out.println("Login successful!");
				isLoggedIn = true;
			} else {
				System.out.println("Login failed. Incorrect username or password. Please try again.");
			}
			System.out.println("=======================");
		}

		// Main Menu (only accessible after successful login)
		while (true) {
			System.out.println("====FoodDelivery Management System====");
			System.out.println("Press 1. Customer Details");
			System.out.println("Press 2. Food Details");
			System.out.println("Press 3. Order Details");
			System.out.println("Press 4. Delivery Boy Details");
			System.out.println("Press 5. Payment Details");
			System.out.println("Press 6. Category Details");
			System.out.println("Press 7. to quit");
			System.out.println("Enter your choice:");
			int input = sc.nextInt();
			sc.nextLine(); // Consume the newline character

			switch (input) {
			case 1:
				AllOperations.CustomerOperations();
				System.out.println("=======================================");
				break;

			case 2:
				AllOperations.FoodOperations();
				System.out.println("=======================================");
				break;

			case 3:
				AllOperations.OrdersOperations();
				System.out.println("=======================================");
				break;

			case 4:
				AllOperations.DeliveryBoyOperations();
				System.out.println("=======================================");
				break;

			case 5:
				AllOperations.PaymentOperations();
				System.out.println("=======================================");
				break;

			/*case 6:
				AllOperations.AdminOperations();
				System.out.println("=======================================");
				break;*/
			case 6:
				AllOperations.CategoriesOperations();
				System.out.println("=======================================");
				break;

			case 7:
				System.out.println("Exiting the application. Thank you!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
			}
		}
		
	}
	

	public static void main(String[] args) {
		mainOps();
	}
	
}