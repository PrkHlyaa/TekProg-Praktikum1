package HighCoupling;

public class HighCouplingRestaurantApp {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		PaymentManager paymentManager = new PaymentManager();
		OrderManager orderManager = new OrderManager(customerManager, paymentManager);
		
		orderManager.takeOrder("Alice", "Pizza");
		orderManager.prepareOrder("Pizza");
	}
}
