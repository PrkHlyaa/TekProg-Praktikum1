package W5.kasus1;


public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;

    public Restaurant(){
        nama_makanan= new String[10];
        harga_makanan= new double[10];
        stok= new int[10];
    }
    public void setNamaMakanan(int index, String nama) {
        nama_makanan[index] = nama;
    }

    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }

    public void setHargaMakanan(int index, double harga) {
        harga_makanan[index] = harga;
    }

    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }

    public void setStok(int index, int stok) {
        this.stok[index] = stok;
    }

    public int getStok(int index) {
        return stok[index];
    }


    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNamaMakanan(id, nama);
        setHargaMakanan(id, harga);
        setStok(id, stok);
    }

    public void tampilMenuMakanan() {
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                if(getNamaMakanan(i).length()>8){
                System.out.println(getNamaMakanan(i) +"["+getStok(i)+"]"+"\tRp. "+getHargaMakanan(i));
                }
                else{
                    System.out.println(getNamaMakanan(i) +"["+getStok(i)+"]"+"\t\tRp. "+getHargaMakanan(i));
                }
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(getStok(id) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
    public void tampilPesanan(int i, int jumlah){
        System.out.println(getNamaMakanan(i) +"["+jumlah+"]"+"\t\tRp. "+getHargaMakanan(i)*jumlah);
            
    }

    public int kurangiStok(int id, int jumlah){
        
        if(getStok(id) - jumlah >=0){

            stok[id] -= jumlah;
            return 1;
        }
        else{
            System.out.println("Pesanan melebihi stok yang tersedia.");
            return 0;
        }
    }
}

