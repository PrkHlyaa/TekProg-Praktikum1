package Exercise3_Manajer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
	private String secretaryName;
	
	public Manager(String n, double s, int day, int month, int year) {
		super(n, s, day, month, year);
		secretaryName = "";
	}

	public void raiseSalary(double byPercent){ 
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName(){ 
		return secretaryName;
	}
}
