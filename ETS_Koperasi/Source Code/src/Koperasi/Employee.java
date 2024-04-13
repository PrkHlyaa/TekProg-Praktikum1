package Koperasi;

public class Employee {
	private String name;
	private String depName;
	private int basePay;
	private int tunLembur;
	private int jamLembur;
	private int tunDep;
	
	departement depart = new departement ();
	
	public Employee(String name, String depName, int jamLembur) {
		this.depName = depart.getDepName(depName);
		this.name = name;
		this.jamLembur = jamLembur;	
	}
	
	public int getTunDep() {
		if (depName == "Manager") {
			return 5000000;
		} else if (depName == "Programmer") {
			return 2000000;
		} else if (depName == "Analis") {
			return 3000000;
		}
		return 0;
	}

	public int getTunLembur() {
		return jamLembur*30000;
	}

	public void setTunLembur(int tunLembur) {
		this.tunLembur = tunLembur;
	}
	
	public int getBasePay() {
		if (depName == "Manager") {
			return 5000000;
		} else if (depName == "Programmer") {
			return 3000000;
		} else if (depName == "Analis") {
			return 3000000;
		}
		return 0;
	}
	
	public int getSalary() {
		return getBasePay() + getTunLembur(); 
	}
	
	public String toString() {
        return null;
    }
}