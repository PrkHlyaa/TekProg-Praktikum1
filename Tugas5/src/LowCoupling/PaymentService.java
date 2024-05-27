package LowCoupling;

public interface PaymentService {
	void processPayment(String customer, double amount);
	void generateReceipt(String customer, double amount);
}
