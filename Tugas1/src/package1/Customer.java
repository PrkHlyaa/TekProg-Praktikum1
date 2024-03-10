package package1;

//second class
public class Customer {
	private String name;
	private Toko toko;
	
	//Konstruktor
	public Customer (String name, Toko toko) {
		this.name = name;
		this.toko = toko;
	}
	
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Toko getToko() {
		return toko;
	}
	
	public void setToko(Toko toko) {
		this.toko = toko;
	}
	
	
	//Menampilkan Detail
	public void tampilkanDetail() {
		System.out.println("Nama Costumer: " + getName());
		System.out.println("Nama Toko: " + toko.getNama());
		System.out.println("Alamat Toko: " + toko.getAlamat());
	}
}
