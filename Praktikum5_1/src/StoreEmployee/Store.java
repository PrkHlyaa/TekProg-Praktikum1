package StoreEmployee;

public interface Store {

    static final double COMMISSION_RATE = 0.10;
    static final double TAX = 0.14;

    /** @return- This method returns the calculateCommission.
     */
    public double calculateCommission();

    /** @param storeSales - The parameter storeSales is passed.
     * @return - This method returns the remaining store revenue.
     */
    public double calculateRemainingStoreRevenue(double storeSales);

	/**
	 * Checks if the employee has annualLeave this year.
	 */
    public boolean checkAnualLeave();

}