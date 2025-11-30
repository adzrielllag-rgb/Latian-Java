import java.util.Scanner;

public class hitungTotalHarga01 {

    static Scanner sc = new Scanner(System.in);

    public static int hitungTotalHarga(int pilihanMenu, int banyakItems, String kodePromo) {

        int hargaItems[] = {15000, 20000, 22000, 12000, 10000, 18000};
       
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItems;
        System.out.println("----------------------------------------");
        System.out.println("Total Harga Awal: Rp." + totalHarga);

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga = totalHarga - (int) (totalHarga * 0.50);
            System.out.println("Kode Promo '" + kodePromo + "' diterima! (Diskon 50%)") ;
        
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga = totalHarga - (int) (totalHarga * 0.30);
            System.out.println("Kode Promo '" + kodePromo + "' diterima! (Diskon 30%)") ;
        }
    
        return totalHarga; 
    }

    public static void main(String[] args) {

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan (1-6): ");
        int pilihan = sc.nextInt();
        
        System.out.print("Banyaknya jumlah item yang ingin anda pesan: ");
        int banyak = sc.nextInt();
    
        sc.nextLine(); 
        
        System.out.print("Masukkan Kode Promo: ");
        String kodePromo = sc.nextLine(); 

        int totalHargaAkhir = hitungTotalHarga(pilihan, banyak, kodePromo);

        System.out.println("Total harga yang harus dibayar: **Rp." + totalHargaAkhir + "**");

        sc.close();
    }
}