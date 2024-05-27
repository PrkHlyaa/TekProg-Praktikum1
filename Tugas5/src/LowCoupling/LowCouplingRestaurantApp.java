package LowCoupling;

public class LowCouplingRestaurantApp {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager();
        PaymentService paymentService = new PaymentManager();
        OrderManager orderManager = new OrderManager(customerService, paymentService);

        orderManager.takeOrder("Alice", "Pizza");
        orderManager.prepareOrder("Pizza");
    }
}
