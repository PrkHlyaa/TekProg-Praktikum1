package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		
		do {
			System.out.println("PENGISIAN INFORMASI LENGKAP PERGURUAN TINGGI");
			System.out.println("Pilih jenis perguruan tinggi:");
			System.out.println("1. Universitas");
			System.out.println("2. Institut");
			System.out.println("3. Politeknik");
			System.out.println("4. Keluar");
			
			pilihan = input.nextInt();
			input.nextLine();
			System.out.print("\n");
			
			switch (pilihan) {
				case 1:
					System.out.println("Masukkan nama Universitas:");
					String namaUniv = input.nextLine();
					System.out.println("Masukkan akreditasi Universitas:");
					String akreditasiUniv = input.nextLine();
					System.out.println("Masukkan Jumlah Fakultas:");
					int jumlahFakUniv = input.nextInt();
					input.nextLine();
					System.out.println("Masukkan Alamat Universitas:");
					String alamatUniv = input.nextLine();
					
					Universitas univ = new Universitas(namaUniv, akreditasiUniv, jumlahFakUniv, alamatUniv);
					univ.info();
					input.nextLine();
					break;
				case 2:
					System.out.println("Masukkan nama Institut:");
					String namaInstitut = input.next();
					input.nextLine();
					System.out.println("Masukkan akreditasi Institut:");
					String akreditasiInstitut = input.nextLine();
					System.out.println("Masukkan Jumlah Fakultas:");
					int jumlahFakInstitut = input.nextInt();
					input.nextLine();
					System.out.println("Masukkan Alamat Institut:");
					String alamatInstitut = input.nextLine();
					
					Institut institut = new Institut(namaInstitut, akreditasiInstitut, jumlahFakInstitut, alamatInstitut);
					institut.info();
					input.nextLine();
					break;
				case 3:
					System.out.println("Masukkan nama Politeknik:");
					String namaPoltek = input.nextLine();
					System.out.println("Masukkan akreditasi Politeknik:");
					String akreditasiPoltek = input.nextLine();
					System.out.println("Masukkan Jumlah Jurusan:");
					int jumlahJurusanPoltek = input.nextInt();
					input.nextLine();
					System.out.println("Masukkan Alamat Politeknik:");
					String alamatPoltek = input.nextLine();
					
					Politeknik poltek = new Politeknik(namaPoltek, akreditasiPoltek, jumlahJurusanPoltek, alamatPoltek);
					poltek.info();
					input.nextLine();
					break;
				case 4:
					System.out.println("Terima kasih telah menggunakan program ini^^");
					break;
				default:
					System.out.println("Pilihan tidak valid, silahkan coba lagi");
					input.nextLine();
					break;	
			}
		} while (pilihan !=4);
		
		input.close();
	}

}
