package RestaurantV2;

public class Pesanan {
	private String[] nama_pesanan;
    private double[] harga_pesanan;
    private int[] quantity;
    private static byte index = 0;
    private double total_belanja = 0;
    
    //constructor
    public Pesanan() {
    	nama_pesanan = new String[10];
    	harga_pesanan = new double[10];
    	quantity = new int[10];
    }
    
    //getters and setters
	public String getNama_pesanan(int index) {
		return nama_pesanan[index];
	}

	public void setNama_pesanan(String[] nama_pesanan) {
		this.nama_pesanan = nama_pesanan;
	}

	public double getHarga_pesanan(int index) {
		return harga_pesanan[index];
	}

	public void setHarga_pesanan(double[] harga_pesanan) {
		this.harga_pesanan = harga_pesanan;
	}

	public int getQuantity(int index) {
		return quantity[index];
	}

	public void setTotal_order(int[] total_order) {
		this.quantity = total_order;
	}

	public double getTotal_belanja() {
		return total_belanja;
	}

	public void setTotal_belanja(int total_belanja) {
		this.total_belanja = total_belanja;
	}

	MenuMakanan menu = new MenuMakanan();
	//Menambah orderan dan menyalin informasi menu yang dipesan ke daftar orderan
	public void tambahOrder(String nama, double harga, int qty) {
		this.nama_pesanan[index] = nama;
		this.harga_pesanan[index] = harga*qty;
		this.quantity[index] = qty;
		index++;
	}

	//Menjumlahkan total harg
	public void totalHarga() {
		for (int i = 0; i < index; i++) {
			total_belanja += getHarga_pesanan(i);
		}
	}
	
	//Menampilkan pesanan beserta total harga pesanan
	public void tampilkanPesanan() {
		System.out.println("\n\n\t\t\tTOTAL PESANAN ANDA");
		System.out.println("\t\t Selamat Menikmati Hidangan Kami^^\n");
		System.out.println("\tNo \t   Nama  \tQuantity \t     Harga");
		for(int i=0; i<index; i++) {	
			System.out.println("\t" + (i+1) + "\t" + getNama_pesanan(i) + "\t  [" + getQuantity(i) + "]" + "\t\t  Rp. " + getHarga_pesanan(i));
		}
		System.out.println("\t\t\t\t\tTotal \t: Rp. " + getTotal_belanja());
	}
}
