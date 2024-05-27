package LowCohesion;

public class LowCohesionRestaurantApp {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.addCustomer("Alice");
		restaurant.takeOrder("Pizza");
		restaurant.prepareOrder("Pizza");
		restaurant.processPayment("Alice", 20.0);
		restaurant.generateReceipt("Alice", 20.0);
	}
}
