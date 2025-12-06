import java.util.Scanner;

public class HItungTotalHarga01Modif {

    static Scanner sc = new Scanner(System.in);
    static String[] namaMenu = {"1", "2", "3", "4", "5", "6"};
    static int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};

    static void tampilkanMenu() {
        System.out.println("\n===== DAFTAR MENU KAFE =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp." + hargaMenu[i]);
        }
        System.out.println("0. Selesai Pesan");
        System.out.println("=============================");
    }

    static void tampilkanPesanan(int[] jumlahItem, int totalSebelumDiskon) {
        System.out.println("\n===== RINCIAN PESANAN =====");
        for (int i = 0; i < namaMenu.length; i++) {
            if (jumlahItem[i] > 0) {
                int totalAwal = hargaMenu[i] * jumlahItem[i];
                System.out.printf("%d. %s x %d = Rp.%d\n", (i + 1),"menu " + namaMenu[i], jumlahItem[i], totalAwal);
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Total Harga Awal: Rp." + totalSebelumDiskon);
    }

    public static int hitungTotalHarga(int totalSebelumDiskon, String kodePromo) {
        int totalHarga = totalSebelumDiskon;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga = totalHarga - (int) (totalHarga * 0.50);
            System.out.println("Kode Promo '" + kodePromo + "' diterima! (Diskon 50%)");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga = totalHarga - (int) (totalHarga * 0.30);
            System.out.println("Kode Promo '" + kodePromo + "' diterima! (Diskon 30%)");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode Promo '" + kodePromo + "' tidak valid! Tidak ada diskon.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        int[] jumlahItem = new int[6]; 
        int totalPesanan = 0; 
        int pilihan;
        boolean melanjutkan = true;

        System.out.println("\n===== SISTEM PEMESANAN KAFE =====");

        while (melanjutkan) {
            tampilkanMenu();
            System.out.print("Pilih nomor menu : ");
            pilihan = sc.nextInt();

            if (pilihan == 0) {
                melanjutkan = false;
                break;
            }

            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Menu tidak valid! Silakan pilih 1-6.");
                continue;
            }

            System.out.print("Banyaknya jumlah item: "); 
            int banyak = sc.nextInt(); 

            if (banyak <= 0) { 
                System.out.println("Jumlah item harus lebih dari 0!");
                continue; 
            }

            jumlahItem[pilihan - 1] += banyak; 
            int hargaItem;
            hargaItem = hargaMenu[pilihan - 1] * banyak;
            totalPesanan += hargaItem;

            System.out.println("" + banyak + "" + namaMenu[pilihan - 1] + " ditambahkan (Rp." + hargaItem + ")");
            System.out.println("Total sementara: Rp." + totalPesanan);
        }

        sc.nextLine(); 

        System.out.print("\nMasukkan Kode Promo (tekan Enter jika tidak ada): ");
        String kodePromo = sc.nextLine();

        tampilkanPesanan(jumlahItem, totalPesanan);

        int totalHargaAkhir = hitungTotalHarga(totalPesanan, kodePromo);

        System.out.println("Total harga yang harus dibayar: **Rp." + totalHargaAkhir + "**");
        System.out.println("=====================================");

        sc.close(); 
    }
}
