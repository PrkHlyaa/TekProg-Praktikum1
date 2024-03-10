package rentalDVD;

public class DVDMusik extends DVD {
	private String[] penyanyi;
    private String[] produser;
    private String[] topHits;
    private String[] kategori;
    private int id; // Untuk mengatur indeks
    
	public DVDMusik() {
        penyanyi = new String[10];
        produser = new String[10];
        topHits =  new String[10];
        kategori = new String[10];
        id = 0;
	}
	
	public void tambahMusik(String judul, String publisher, int stok, String penyanyi, 
			String produser, String topHits, String kategori) {
		super.tambahDVD(judul, publisher, stok);
		this.penyanyi[id] = penyanyi;
		this.produser[id] = produser;
		this.topHits[id] = topHits;
		this.kategori[id] = kategori;
		id++;
	}
	
	@Override
	public void tampilkanInfo(int id) {
		System.out.println("\n\t\t===RENTAL DVD ZAHRA===\n");
		for (int i = 0; i < id; i++) {
			super.tampilkanInfo(i);
			System.out.println(" Penyanyi  : " + penyanyi[i]);
			System.out.println(" Produser  : " + produser[i]);
			System.out.println(" Top Hits  : " + topHits[i]);
			System.out.println(" Kategori  : " + kategori[i]);
			System.out.println();
		}
	}
}