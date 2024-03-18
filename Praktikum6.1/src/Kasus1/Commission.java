package Kasus1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socialSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socialSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay(){
        double basePay  = super.pay();
        double commisionPay = totalSales * commissionRate;
        totalSales = 0;
        
        return basePay + commisionPay;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result +="\nTotal Sales		: " +totalSales;
        return result;
    }
}

