package LowCoupling;

public class OrderManager {
	private CustomerService customerService;
	private PaymentService paymentService;
	
	public OrderManager(CustomerService customerService, PaymentService paymentService) {
		this.customerService = customerService;
		this.paymentService = paymentService;
	}
	
	public void takeOrder(String customer, String order) {
		customerService.addCustomer(customer);
		System.out.println("Order taken: " + order);
		paymentService.processPayment(customer, 20.0);
	}
	
	public void prepareOrder(String order) {
		System.out.println("Order prepared: " + order);
	}
}
