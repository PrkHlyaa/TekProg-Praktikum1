package rentalDVD;

public abstract class DVD {
	private String[] judul;
	private String[] publisher; 
	private int[] stok;
	private int id;
	

	//constructor
	public DVD() {
		judul = new String[10];
		publisher = new String[10];
		stok = new int[10];
		id = 0;
	}
	
	public void tambahDVD(String judul, String publisher, int stok) {
		this.judul[id] = judul;
		this.publisher[id] = publisher;
		this.stok[id] = stok;
		id++;
	}
	
	//getter and setter
	public String getJudul(int id) {
		return judul[id];
	}
	
	public void setJudul(int id, String judulTerbaru) {
		judul[id] = judulTerbaru;
	}
	
	public String getPublisher(int id) {
		return publisher[id];
	}
	
	public void setPublisher(int id, String publisherTerbaru) {
		publisher[id] = publisherTerbaru;
	}
	
	public int getStok(int id) {
		return stok[id];
	}
	
	public void setStok(int id, int stokTerbaru) {
		stok[id] = stokTerbaru;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//methods
	public boolean CekStok(int dvdNumber, int jumlah) {
		dvdNumber = dvdNumber-1;
		if(dvdNumber < id && dvdNumber >= 0) {
			if (jumlah == 0){
				System.out.println("\t\t--Tidak dapat memproses peminjaman--");
				return false;
			} else if (jumlah <= stok[dvdNumber]) {
				System.out.println("\t\t--Peminjaman sedang diproses--");
				return true;
			} else {
				System.out.println("\t\t--Stok DVD yang anda inginkan tidak tersedia--");
				return false;
			}
		} else {
			System.out.println("\t\t--DVD yang dimasukkan tidak valid--");
			return false;
		}
	}
	
	public void pinjamDVD(int dvdNumber, int jumlah) {
		if (jumlah <= stok[dvdNumber]) {
			stok[dvdNumber] -= jumlah;
			System.out.println(jumlah + " DVD berhasil dipinjam.");
		} 
	}
	
	public void kembalikanDVD(int dvdNumber, int jumlah) {
		stok[dvdNumber] += jumlah;
		System.out.println(jumlah + " DVD berhasil dikembalikan.");
	}

	public void tampilkanInfo(int i) {
		System.out.println(" No        : " + (i+1));
		System.out.println(" Judul     : " + getJudul(i));
		System.out.println(" Publisher : " + getPublisher(i));
		System.out.println(" Stok      : " + getStok(i));	
	}

}
