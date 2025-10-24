import java.util.Scanner;

public class TUGAS02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jenis,total=0;
    int durasi =0;


    do {
        System.out.print("Pilih Jenis Kendaraan (1. Motor, 2. Mobil, 0. Keluar): ");

        jenis = input.nextInt();
        
        if (jenis == 1 || jenis == 2) {
          System.out.print("Masukkan durasi parkir (jam): ");
          durasi = input.nextInt();
          
          
          if (durasi > 5 ) {
            total += 12500;
            
          } else if (jenis == 1) {
            total += durasi * 3000;
        } else if (jenis == 2) {
          total += durasi * 2000;
        }
        
        System.out.println("Total Biaya: " + total);
      }

    } while (jenis != 0);

    System.out.println("Total Biaya parkir:  Rp. " + total);

}
}

  
  

