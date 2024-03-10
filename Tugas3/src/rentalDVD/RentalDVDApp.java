package rentalDVD;

import java.util.Scanner;

public class RentalDVDApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DVDMusik musik1 = new DVDMusik();
//		(String judul, String publisher, int stok, String penyanyi, String produser, String topHits, String kategori) 
        musik1.tambahMusik("GOLDEN", "BIGHIT", 10, "Jung Kook", "Quincy Jones", "Seven", "Pop");
        musik1.tambahMusik("FACE", "BIGHIT", 10, "Jimin", "Pd Bang", "Like Crazy", "Pop Ballad");
        
        DVDFilm film1 = new DVDFilm();
//		(String judul, String publisher, int stok, String pemeran, String sutradara, String kategori, int tahunRilis)
        film1.tambahFilm("Avengers: Endgame", "Marvel Studios", 10, "Robert Downey Jr., Chris Evans", "Anthony Russo dan Joe Russo", "Semua Umur", 2019);
        film1.tambahFilm("The Chronicles of Narnia: The Lion, the Witch, and the Wardrobe", "Walt Disney Pictures", 10, "Georgie Henley", "Andrew Adamson", "Semua Umur", 2005);
        
		int user;
		do {
			System.out.println("\n\tSELAMAT DATANG DI RENTAL DVD ZAHRA");
			System.out.println("\t\tMASUK  SEBAGAI\n");
			System.out.println("1. Pengelola");
			System.out.println("2. Customer");
			System.out.println("3. Keluar");
			
			System.out.print("Input: ");
			user = scanner.nextInt();
			scanner.nextLine();
			
			int menu = 0;
			if (user == 1) {
					do {
						System.out.println("\n\t    MENU PENGELOLA RENTAL DVD\n");
						System.out.println("1. Menambah DVD Musik");
						System.out.println("2. Menambah DVD Film");
						System.out.println("3. Memperbarui Stok DVD Musik");
						System.out.println("4. Memperbarui Stok DVD Film");
						System.out.println("5. Melihat Stok DVD Musik");
						System.out.println("6. Melihat Stok DVD Film");
						System.out.println("7. Kembali");
						
						System.out.print("Input: ");
						menu = scanner.nextInt();
						scanner.nextLine();
						System.out.print("\n");
						
						switch (menu) {
							case 1:
								System.out.println("\t\tProses Penambahan DVD Musik");
								System.out.println("Masukkan Informasi DVD yang diperlukan");
//								(String judul, String publisher, int stok, String penyanyi, String produser, String topHits, String kategori) 
								System.out.print("Judul Musik	: ");
								String judulMusik = scanner.nextLine();
								System.out.print("Publisher Musik	: ");
								String publisherMusik = scanner.nextLine();
								System.out.print("Stok		: ");
								int stokMusik = scanner.nextInt();
								scanner.nextLine();
								System.out.print("Penyanyi	: ");
								String penyanyi = scanner.nextLine();
								System.out.print("Produser	: ");
								String produser = scanner.nextLine();
								System.out.print("Top Hits	: ");
								String topHits = scanner.nextLine();
								System.out.print("Kategori	: ");
								String kategoriMusik = scanner.nextLine();
								
								musik1.tambahMusik(judulMusik, publisherMusik, stokMusik, penyanyi, produser, topHits, kategoriMusik);
								musik1.tampilkanInfo(musik1.getId());
								scanner.nextLine();
								break;
							case 2:
								System.out.println("\t\tProses Penambahan DVD Film");
								System.out.println("Masukkan Informasi DVD yang diperlukan");
//								(String judul, String publisher, int stok, String pemeran, String sutradara, String kategori, int tahunRilis)
								System.out.print("Judul Film	: ");
								String judulFilm = scanner.nextLine();
								System.out.print("Publisher Film	: ");
								String publisherFilm = scanner.nextLine();
								System.out.print("Stok DVD Film	:  ");
								int stokFilm = scanner.nextInt();
								scanner.nextLine();
								System.out.print("Pemeran	: ");
								String pemeran = scanner.nextLine();
								System.out.print("Sutradara	: ");
								String sutradara = scanner.nextLine();
								System.out.print("Kategori Film	: ");
								String kategoriFilm = scanner.nextLine();
								System.out.print("Tahun Rilis	: ");
								int tahunRilis = scanner.nextInt();
								
								film1.tambahFilm(judulFilm, publisherFilm, stokFilm, pemeran, sutradara, kategoriFilm, tahunRilis);
								film1.tampilkanInfo(film1.getId());
								scanner.nextLine();
								break;
							case 3:
								System.out.println("\t\tProses Memperbarui Stok DVD Musik");
								musik1.tampilkanInfo(musik1.getId());
								System.out.print("Pilih number DVD yang akan diperbarui: ");
								int numberDVDMusik = scanner.nextInt();
								System.out.print("Stok terbaru	: ");
								int stokMusikTerbaru = scanner.nextInt();
								scanner.nextLine();
								
								musik1.setStok(numberDVDMusik-1, stokMusikTerbaru);
								break;							
							case 4:
								System.out.println("\t\tProses Memperbarui Stok DVD Film");
								film1.tampilkanInfo(film1.getId());
								System.out.print("Pilih Number DVD: ");
								int numberDVDFilm = scanner.nextInt();
								System.out.print("Stok terbaru	: ");
								int stokFilmTerbaru = scanner.nextInt();
								scanner.nextLine();
								
								film1.setStok(numberDVDFilm-1, stokFilmTerbaru);
								break;
							case 5:
								musik1.tampilkanInfo(musik1.getId());
								scanner.nextLine();
								break;
							case 6:
								film1.tampilkanInfo(film1.getId());
								scanner.nextLine();
								break;
							case 7:
								break;
							default:
								System.out.println("Pilihan tidak valid, silahkan coba lagi");
								scanner.nextLine();
								break;	
						}
					} while (menu !=7);
			} 
			else if (user == 2) {
					do {
						System.out.println("\n\t    MENU CUSTOMER RENTAL DVD\n");
						System.out.println("1. Meminjam DVD Musik");
						System.out.println("2. Mengembalikan DVD Musik");
						System.out.println("3. Meminjam DVD Film");
						System.out.println("4. Mengembalikan DVD Film");
						System.out.println("5. Kembali");
						
						menu = 0;
						System.out.print("Input: ");
						menu = scanner.nextInt();
						scanner.nextLine();
						System.out.print("\n");
						
						int numberDVDMusik, jumlahDVDMusik;
						int numberDVDFilm, jumlahDVDFilm;
						switch (menu) {
							case 1:
								System.out.print("\t\tProses Peminjaman DVD");
								
								musik1.tampilkanInfo(musik1.getId());
								System.out.println("Silahkan pilih DVD yang ingin anda pinjam!!\n");
								System.out.print("Pilih Number DVD: ");
								numberDVDMusik = scanner.nextInt();
								System.out.print("Jumlah yang akan dipinjam: ");
								jumlahDVDMusik = scanner.nextInt();
								
								if (musik1.CekStok(numberDVDMusik, jumlahDVDMusik)) {
									musik1.pinjamDVD(numberDVDMusik-1, jumlahDVDMusik);
								}
								scanner.nextLine();
								break;
							case 2:
								musik1.tampilkanInfo(musik1.getId());
								System.out.println("Silahkan pilih DVD yang ingin anda kembalikan!!\n");
								
								System.out.print("Pilih Number DVD: ");
								numberDVDMusik = scanner.nextInt();
								System.out.print("Jumlah yang akan dikembalikan: ");
								jumlahDVDMusik = scanner.nextInt();
								
								System.out.println("\t\tProses Pengembalian DVD");
								musik1.kembalikanDVD(numberDVDMusik-1, jumlahDVDMusik);
								scanner.nextLine();
								break;
							case 3:
								System.out.print("\t\tProses Peminjaman DVD");
								film1.tampilkanInfo(film1.getId());
								System.out.println("Silahkan pilih DVD yang ingin anda pinjam!!\n");
								
								System.out.print("Pilih Number DVD: ");
								numberDVDFilm = scanner.nextInt();
								System.out.print("Jumlah yang akan dipinjam: ");
								jumlahDVDFilm = scanner.nextInt();
								
								if (film1.CekStok(numberDVDFilm, jumlahDVDFilm)) {
									film1.pinjamDVD(numberDVDFilm-1, jumlahDVDFilm);
								}
								scanner.nextLine();
								break;
							case 4:								
								film1.tampilkanInfo(film1.getId());
								System.out.println("Silahkan pilih DVD yang ingin anda kembalikan!!\n");
								System.out.print("Pilih Number DVD: ");
								numberDVDFilm = scanner.nextInt();
								System.out.print("Jumlah yang akan dikembalikan: ");
								jumlahDVDFilm = scanner.nextInt();
								
								System.out.println("\t\tProses Pengembalian DVD");
								film1.kembalikanDVD(numberDVDFilm-1, jumlahDVDFilm);
								scanner.nextLine();
							case 5:
								break;
							default:
								System.out.println("Pilihan tidak valid, silahkan coba lagi");
								scanner.nextLine();
								break;	
						}
					} while (menu !=5);
			}
			else if (user == 3) {
				break;
			}
			else {
				System.out.println("Pilihan tidak valid, silahkan coba lagi");
				scanner.nextLine();
				break;	
			}
		} while (user !=3);

	}

}