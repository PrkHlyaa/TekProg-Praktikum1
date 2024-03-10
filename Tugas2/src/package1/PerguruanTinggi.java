package package1;

public abstract class PerguruanTinggi {
	private String nama;
	
	public PerguruanTinggi(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract void info();
}