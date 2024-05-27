package LowCohesion;

public class Restaurant {
	// Order management
	public void takeOrder(String order) {
		System.out.println("Order taken: " + order);
	}
	
	public void prepareOrder(String order) {
		System.out.println("Order prepared: " + order);
	}
	
	// Customer management
	public void addCustomer(String customer) {
		System.out.println("Customer added: " + customer);
	}
	
	public void getCustomerDetails(String customer) {
		System.out.println("Customer details for: " + customer);
	}
	
	// Payment management
	public void processPayment(String customer, double amount) {
		System.out.println("Payment processed for " + customer + ": $" + amount);
	}
	
	public void generateReceipt(String customer, double amount) {
		System.out.println("Receipt generated for " + customer + ": $" + amount);
	}
}


