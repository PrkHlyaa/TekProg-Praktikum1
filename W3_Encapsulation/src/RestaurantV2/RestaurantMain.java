package RestaurantV2;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MenuMakanan menu = new MenuMakanan();
		Pesanan order = new Pesanan();
		
		//Input menu makanan
		menu.tambahMenu("Perde pilav", 10_000, 0);
		menu.tambahMenu("Cag kebab", 25_000, 5);
		menu.tambahMenu("Hamsili pilav", 20_000, 10);
		menu.tambahMenu("Iskander kebab", 10_000, 2);
		menu.tambahMenu("Inegol kofte", 20_000, 3);
		menu.tambahMenu("Borek Turki", 15_000, 5);
		menu.tambahMenu("Biber Dolma", 10_000, 5);
		menu.tambahMenu("Kuzu Tandır", 10_000, 10);
		menu.tambahMenu("Mercim Köftesi", 35_000, 10);
		menu.tambahMenu("Icli Kofle", 5_000, 10);
		
		while (true) {
			//Menampilkan Menu kepada user
			menu.tampilMenuMakanan();
			System.out.print("\nPilih Nomor Menu : ");
			int menuNumber = scanner.nextInt();
			System.out.print("Jumlah Pesanan: ");	
			int qty = scanner.nextInt();	
			//Mengecek ketersediaan menu
			if (menu.CekStok(menuNumber, qty)) {
				order.tambahOrder(menu.getNama_makanan(menuNumber-1), menu.getHarga_makanan(menuNumber-1), qty);
			}
			
			System.out.print("Ketik 0 jika sudah selesai memesan dan angka lainnya untuk memesan kembali: ");
			int pesanLagi = scanner.nextInt();
			if (pesanLagi == 0) {
				break;
			}
		}
		order.totalHarga();
		order.tampilkanPesanan();
		
		scanner.close();
	}

}
