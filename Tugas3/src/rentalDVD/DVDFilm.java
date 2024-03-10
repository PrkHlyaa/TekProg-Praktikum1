package rentalDVD;

public class DVDFilm extends DVD{
	private String[] pemeran;
    private String[] sutradara;
    private String[] kategori;
    private int[] tahunRilis;
    private int id;
    
	public DVDFilm() {
		pemeran = new String[10];
        sutradara = new String[10];
        kategori =  new String[10];
        tahunRilis = new int[10];
        id = 0;
	}
	
	public void tambahFilm(String judul, String publisher, int stok, String pemeran, 
			String sutradara, String kategori, int tahunRilis) {
		super.tambahDVD(judul, publisher, stok);
		this.pemeran[id] = pemeran;
		this.sutradara[id] = sutradara;
		this.kategori[id] = kategori;
		this.tahunRilis[id] = tahunRilis;
		id++;
	}
	
	@Override
	public void tampilkanInfo(int id) {
		System.out.println("\n\t\t===RENTAL DVD ZAHRA===\n");
		for (int i = 0; i < id; i++) {
			super.tampilkanInfo(i);
			System.out.println(" Pemeran   : " + pemeran[i]);
			System.out.println(" Sutradara : " + sutradara[i]);
			System.out.println(" Kategori  : " + kategori[i]);
			System.out.println(" Tahun Rilis : " + tahunRilis[i]);
			System.out.println();
		}
	}

}
