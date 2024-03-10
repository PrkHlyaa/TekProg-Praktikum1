package package1;

public class Main {

	public static void main(String[] args) {
		Toko toko1 = new Toko("Azzahra", "Jl. Merdeka No 91");
		Customer customer1 = new Customer("Zahra Hilyah", toko1);
		customer1.tampilkanDetail();
	}

}