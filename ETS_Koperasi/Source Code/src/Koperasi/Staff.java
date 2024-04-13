package Koperasi;

public class Staff {
	
	public static void main(String[] args) {
		FullTime Asep = new FullTime ("Asep, ", "Programmer", 3, 2, 500000);
		PartTime Ujang = new PartTime ("Ujang ", "Programmer" , 5) ;
		
		System.out.println("Gaji Asep di bulan April adalah " + Asep.getSalary()); 
		System.out.println("Gaji Ujang di bulan April adalah " + Ujang.getSalary());
	}


}
