package RestaurantVAI;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Produk> selectedItems = new ArrayList<>();

    public List<Produk> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<Produk> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public void addItem(Produk item, int qty) {
        if (!item.isOutOfStock()) {
            selectedItems.add(item);
            item.decreaseStock(qty);
        } else {
            System.out.println(item.getName() + " sudah habis.");
        }
    }

    public double calculateTotalCost(int qty) {
        double totalCost = 0;
        for (Produk item : selectedItems) {
            totalCost += item.getPrice() * qty;
        }
        return totalCost;
    }

}
