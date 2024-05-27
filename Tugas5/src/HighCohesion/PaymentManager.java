package HighCohesion;

public class PaymentManager {
    public void processPayment(String customer, double amount) {
        System.out.println("Payment processed for " + customer + ": $" + amount);
    }

    public void generateReceipt(String customer, double amount) {
        System.out.println("Receipt generated for " + customer + ": $" + amount);
    }
}
