package Koperasi;

public class PartTime extends Employee{
	private int absensi;

	public PartTime(String name, String depName, int jamLembur) {
		super (name, depName, jamLembur);
	}
	
	public int getAbsensi() {
		return absensi;
	}

	public void setAbsensi(int absensi) {
		this.absensi = absensi;
	}

	@Override
	public int getSalary() {
		return super.getSalary();
	}
	
}
