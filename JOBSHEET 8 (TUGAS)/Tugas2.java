import java.util.Scanner;

public class Tugas2 {

   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int jumlah_politeknik, jumlah_atlet_per_cabor, i, j;
        String cabor1 = "badminton", cabor2 = "tenisMeja", cabor3 = "basket", cabor4 = "voli";
        String namaAtlet="", tambahan;

        
        do {
        System.out.print(" Masukkan nama Politeknik = "); 
        String namaPoliteknik = sc.nextLine();


        System.out.println("\n Cabang Olahraga: " + cabor1); 
        for (j=1; j<=5; j++){
            System.out.print(" Nama Atlet ke- " + j + "="); 
            namaAtlet = sc.nextLine();
        }

        System.out.println(" Cabang Olahraga: " + cabor2);
        for (j=1; j<=5; j++){
            System.out.print(" Nama Atlet ke- " + j + "="); 
            namaAtlet = sc.nextLine(); 
        }

        System.out.println(" Cabang Olahraga: " + cabor3); 
        for (j=1; j<=5; j++){
            System.out.print(" Nama Atlet ke- " + j + "="); 
          namaAtlet= sc.nextLine();
        }

        System.out.println(" Cabang Olahraga: " + cabor4);
        for (j=1; j<=5; j++){
            System.out.print(" Nama Atlet ke- " + j + "=");
       namaAtlet = sc.nextLine();
        }

        System.out.print("lihat politeknik lain? (ya/tidak): ");
        tambahan = sc.nextLine();
        System.out.println();
    } while (tambahan.equalsIgnoreCase("ya"));

    System.out.println(" \n===== input data selesai ===== ");
    
    sc.close();
 }
}