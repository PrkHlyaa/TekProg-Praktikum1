package package1;

public class Institut extends PerguruanTinggi {
	private String akreditasi;
	private int jumlahFakultas;
	private String alamat;
	
	public Institut(String nama, String akreditasi, int jumlahFakultas, String alamat) {
		super(nama);
		this.akreditasi = akreditasi;
		this.jumlahFakultas = jumlahFakultas;
		this.alamat = alamat;
	}

	@Override
	public void info() {
		System.out.println("\n\nINFORMASI INSTITUT \n");
		System.out.println("Nama            : " +getNama());
		System.out.println("Akreditasi      : " +akreditasi);
		System.out.println("Jumlah Fakultas : " +jumlahFakultas);
		System.out.println("Alamat          : " +alamat);		
		System.out.println("\n\n");
	}
}
