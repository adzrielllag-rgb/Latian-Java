import java.util.Scanner;

public class BioskopWithScanner01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;
    
    String[][] penonton = new String[4][2];
    int menu, baris, kolom;
    String nama;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama : ");
                nama = sc.nextLine();


                while (true) {
                    System.out.print("Masukkan Baris : ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan Kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris atau kolom tidak tersedia! Coba lagi.");
                        continue; 
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silakan pilih baris dan kolom lain!");
                        continue; 
                    }
                    break;
                }

                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data berhasil disimpan!");

            } 
            else if (menu == 2) {
                System.out.println("\n------ Daftar Penonton -------");
                for (int j = 0; j < penonton.length; j++) {
                    for (int k = 0; k < penonton[j].length; k++) {
                        String isi = (penonton[j][k] == null) ? "*" : penonton[j][k];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }

            } 
        }
    }
}