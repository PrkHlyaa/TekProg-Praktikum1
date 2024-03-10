package RestaurantVAI;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<Produk> menu = new ArrayList<>();

    public void initializeMenu() {
        menu.add(new Produk("Nasi Goreng", 25.0, 10));
        menu.add(new Produk("Ayam Bakar", 30.0, 8));
        // Add more menu items if needed
    }

    public void displayMenu() {
        System.out.println("Menu Makanan:");
        for (int i = 0; i < menu.size(); i++) {
            Produk item = menu.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " [" + item.getStock() + "] Rp. " + item.getPrice());
        }
    }

    public Produk getMenuItem(int menuNumber) {
        if (menuNumber >= 1 && menuNumber <= menu.size()) {
            return menu.get(menuNumber - 1);
        } else {
            System.out.println("Menu tidak valid.");
            return null;
        }
    }

}
