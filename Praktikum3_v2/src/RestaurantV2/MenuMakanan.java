package RestaurantV2;

public class MenuMakanan {
	private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;
    
    //constructor
	public MenuMakanan() {
		nama_makanan= new String[10];
		harga_makanan= new double[10];
		stok= new int[10];
	}

	//getter and setter
	public String getNama_makanan(int id) {
		return nama_makanan[id];
	}

	public void setNama_makanan(int id, String nama_makanan) {
		this.nama_makanan[id] = nama_makanan;
	}

	public double getHarga_makanan(int id) {
		return harga_makanan[id];
	}

	public void setHarga_makanan(int id, double harga_makanan) {
		this.harga_makanan[id] = harga_makanan;
	}

	public int getStok(int id) {
		return stok[id];
	}

	public void setStok(int[] stok) {
		this.stok = stok;
	}

	public void tambahMenu(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
		id++;
	}
	
	public boolean CekStok(int menuNumber, int qty) {
		menuNumber = menuNumber-1;
		if(menuNumber < id && menuNumber >= 0) {
			if (qty == 0){
				System.out.println("\t\t--Tidak dapat memproses pesanan--");
				return false;
			} else if (qty <= stok[menuNumber]) {
				stok[menuNumber] -= qty;
				System.out.println("\t\t\t--Pesanan telah dicatat--");
				return true;
			} else {
				System.out.println("\t\t\t--Stok tidak tersedia--");
				return false;
			}
		} else {
			System.out.println("\t\t--Menu yang dimasukkan tidak valid--");
			return false;
		}
	}
	
	public void tampilMenuMakanan() {
		System.out.println("\n\t\tSELAMAT DATANG DI RESTAURANT MGS");
		System.out.println("\t\t  Silahkan pilih pesanan anda\n");
		System.out.println("\tNo \t    Nama\tStok \t   Harga");
		for(int i=0; i<id; i++) {	
			System.out.println("\t" + (i+1) + "\t" + getNama_makanan(i) + "\t[" + getStok(i) + "]" + "\t Rp. " + getHarga_makanan(i));
		}
	}
}
