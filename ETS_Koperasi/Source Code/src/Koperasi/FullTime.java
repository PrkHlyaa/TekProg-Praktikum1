package Koperasi;

public class FullTime extends Employee implements Koperasi {
	private int anak;
	private int pinjaman;
	private int tunJab;
	private int tunKom = 500000;

	public FullTime(String name, String depName, int jamLembur, int anak, int pinjaman) {
		super (name, depName, jamLembur);
		this.pinjaman = pinjaman;
		this.anak = anak;
	}
	
	public int getTunAnak() {
		return anak*500000;
	}

	@Override
	public int LoanMonthly() {
		return pinjaman;
	}

	@Override
	public int getSalary() {
		int salary = super.getSalary() + super.getTunDep() + tunKom + getTunAnak() - LoanMonthly();
		return salary;
	}


}
