package Kasus1;

public class Hourly extends Employee{
    private int hoursWorked;

    public Hourly(String eName, String eAddress, String ePhone, String socialSecNumber, double rate){
        super(eName, eAddress, ePhone, socialSecNumber, rate);
    }
    
    public void addHours(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double pay(){
        double payment = payRate * hoursWorked;
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        result +="\nCurrent hours 		: "+hoursWorked;
        return result;
    }
}

