package RestaurantVAI;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        restaurant.initializeMenu();

        restaurant.displayMenu();

        // Inisialisasi variabel total biaya
        double totalBiaya = 0.0;

        while (true) {
            System.out.print("Pilih nomor menu (0 untuk selesai): ");
            int menuNumber = scanner.nextInt();

            if (menuNumber == 0) {
                break; // Pengguna selesai memilih
            }

            System.out.print("Jumlah pesanan: ");
            int qty = scanner.nextInt();

            Produk selected = restaurant.getMenuItem(menuNumber);
            if (selected != null) {
                // Tambahkan biaya pesanan ke total
                double biayaPesanan = selected.getPrice() * qty;
                totalBiaya += biayaPesanan;

                System.out.println("\nPesanan Anda:");
                System.out.println(selected.getName() + " [" + selected.getStock() + "] x " + qty);
                System.out.println("Biaya Pesanan: Rp. " + biayaPesanan);
            } else {
                System.out.println("Menu tidak valid. Silakan pilih nomor menu yang benar.");
            }
        }

        System.out.println("\nTotal Biaya: Rp. " + totalBiaya);
        System.out.println("Terima kasih telah memesan di restoran kami!");
        scanner.close();
    }

}
