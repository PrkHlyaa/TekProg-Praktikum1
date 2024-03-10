package RestauranPackage;

public class Produk {
	//instance fields
	private String nama;
	private double harga;
	private int stok;
	
	//constructor
	public Produk(String nama, double harga, int stok) {
		this.nama = nama;
		this.harga = harga;
		this.stok = stok;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

    public void kurangiStok (int qty) {
        if (qty <= stok) {
            stok -= qty;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
    
	public boolean isOutofStock() {
		return stok == 0;
	}
}