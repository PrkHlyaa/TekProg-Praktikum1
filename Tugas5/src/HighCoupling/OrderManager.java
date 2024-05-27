package HighCoupling;

public class OrderManager {
    private CustomerManager customerManager;
    private PaymentManager paymentManager;

    public OrderManager(CustomerManager customerManager, PaymentManager paymentManager) {
        this.customerManager = customerManager;
        this.paymentManager = paymentManager;
    }

    public void takeOrder(String customer, String order) {
        customerManager.addCustomer(customer);
        System.out.println("Order taken: " + order);
        paymentManager.processPayment(customer, 20.0);
    }

    public void prepareOrder(String order) {
        System.out.println("Order prepared: " + order);
    }
}
