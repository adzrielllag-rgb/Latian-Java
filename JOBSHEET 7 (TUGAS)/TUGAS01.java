import java.util.Scanner;

public class TUGAS01 { 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double hargaTiket=50000, totalBayar;
    int jumlahTiket;

    do {
      System.out.print(" jumlah tiket yang terjual hari ini: ");
      jumlahTiket = sc.nextInt();

      if (jumlahTiket <= 0) {
    
        continue;
      }

      double totalHarga = hargaTiket * jumlahTiket;

      if (jumlahTiket > 4) {
        if(jumlahTiket > 10) {
          totalBayar = totalHarga * 0.85;
        } else {
          totalBayar = totalHarga * 0.90;
        }
      } else {
        totalBayar = totalHarga;
      }
      
      System.out.println("Total biaya  tiket yang terjual: " + totalBayar);
      
      
    } while (true);

  } 
}
  
  

