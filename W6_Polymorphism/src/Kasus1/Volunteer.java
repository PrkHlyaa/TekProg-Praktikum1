package Kasus1;

public class Volunteer extends StaffMember{
    
	public Volunteer(String eName, String eAddress, String ePhone){
        super(eName, eAddress, ePhone);
    }
   
	//Returns a zero pay for this volunteer
    public double pay(){
        return 0.0;
    }
}

