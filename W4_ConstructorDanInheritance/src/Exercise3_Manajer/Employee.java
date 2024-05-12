package Exercise3_Manajer;

public class Employee extends Sortable{
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;

	public Employee(String n, double s, int day, int month, int year) {
		this.name = n;
		this.salary = s;
		this.setHireday(day);
		this.setHiremonth(month);
		this.hireyear = year;
	}
	
	public int hireYear(){ 
		return hireyear;
	}
	
	public void raiseSalary(double byPercent){ 
		salary *= 1 + byPercent / 100;
	}
	
	public int compare(Sortable b){
		 Employee eb = (Employee) b;
		 if (salary<eb.salary) return -1;
		 if (salary>eb.salary) return +1;
		 return 0;
	}
	
	public void print(){ 
		System.out.println(name + " " + salary + " " + hireYear());
	}

	public int getHireday() {
		return hireday;
	}

	public void setHireday(int hireday) {
		this.hireday = hireday;
	}

	public int getHiremonth() {
		return hiremonth;
	}

	public void setHiremonth(int hiremonth) {
		this.hiremonth = hiremonth;
	}

}
