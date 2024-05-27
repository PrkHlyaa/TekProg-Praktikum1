package LowCoupling;

public class CustomerManager implements CustomerService {
    public void addCustomer(String customer) {
        System.out.println("Customer added: " + customer);
    }

    public void getCustomerDetails(String customer) {
        System.out.println("Customer details for: " + customer);
    }
}
