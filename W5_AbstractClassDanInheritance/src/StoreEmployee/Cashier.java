package StoreEmployee;

public class Cashier extends AbstractStoreEmployee{
	
	private double cashierRate;

	public Cashier(double cashierRate, double numberOfHoursWorked, double hourlyRate,
            String storeDetails, String associateName, double basePay) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, associateName);
        this.cashierRate=cashierRate;
    }
	
    @Override
    public double calculateCommission() {
        if (getCashierRate() > 50) {
            return super.getBasePay() * COMMISSION_RATE;
        } else {
            return 0.0;
        }
    }

    @Override
    public double calculatePay() {
        return super.getBasePay() + calculateCommission() + 
                (super.getNumberOfHoursWorked() * super.getHourlyRate());
    }

    @Override
    public boolean checkPromotionEligibility() {
        if (calculatePay() > 20000.0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns the total Annual Wage Supplement for Cashier
     */
	@Override
	public double calculateAWS() {
		return super.getBasePay();
	}
	
	@Override
	public String employeeType() {
		return "Part Time Employee";
	}
	
    public double getCashierRate() {
        return cashierRate * 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Cashier Rate: " + getCashierRate() + "%";
    }

} 
