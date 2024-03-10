package package1;

public class Politeknik extends PerguruanTinggi {
	private String akreditasi;
	private int jumlahJurusan;
	private String alamat;
	
	public Politeknik(String nama, String akreditasi, int jumlahJurusan, String alamat) {
		super(nama);
		this.akreditasi = akreditasi;
		this.jumlahJurusan = jumlahJurusan;
		this.alamat = alamat;
	}

	@Override
	public void info() {
		System.out.println("\n\nINFORMASI POLITEKNIK \n");
		System.out.println("Nama            : " +getNama());
		System.out.println("Akreditasi      : " +akreditasi);
		System.out.println("Jumlah Jurusan : " +jumlahJurusan);
		System.out.println("Alamat          : " +alamat);
		System.out.println("\n\n");
	}

}
