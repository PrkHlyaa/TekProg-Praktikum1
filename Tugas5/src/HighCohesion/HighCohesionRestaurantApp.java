package HighCohesion;

public class HighCohesionRestaurantApp {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		OrderManager orderManager = new OrderManager();
		PaymentManager paymentManager = new PaymentManager();
		
		customerManager.addCustomer("Alice");
		orderManager.takeOrder("Pizza");
		orderManager.prepareOrder("Pizza");
		paymentManager.processPayment("Alice", 20.0);
		paymentManager.generateReceipt("Alice", 20.0);
	}
}
