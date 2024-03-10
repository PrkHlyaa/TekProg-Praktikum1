package RestauranPackage;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Produk> orderan = new ArrayList<>();
	
	public List<Produk> getOrderan() {
		return orderan;
	}

	public void setOrderan(List<Produk> orderan) {
		this.orderan = orderan;
	}
	
	public void tambahOrder(Produk item, int qty) {
		if(!item.isOutofStock()) {
			orderan.add(item);
			item.kurangiStok(qty);
		} else {
			System.out.println("stok " + item.getNama() + "tidak mencukupi");
			System.out.println(item.getNama() + " hanya tersisa" + item.getStok());
		}
	}

	
//	public double menghitungTotal(Produk item, int qty) {
//		double total = 0;
//		for (Produk item : orderan) {
//			total += item.getHarga() * qty;
//		}
//		return total;
//	}
//	
//	//Menampilkan detail pesanan
//	public void tampilkanPesanan(int qty) {
//		System.out.println("Pesanan Anda: ");
//		for (Produk item : getOrderan()) {
//			System.out.println(item.getNama() + "\t[" + qty + "]\t");
//		}
//		System.out.println("Total Bayar: Rp. " + menghitungTotal(item, qty));
//	}
}