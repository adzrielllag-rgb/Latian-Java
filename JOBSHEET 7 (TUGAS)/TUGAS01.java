import java.util.Scanner;

public class TUGAS01 { 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double hargaTiket=50000, totalBayar,totalHarga,bayarAkhir=0;
    int jumlahTiket=0,totalTiket=0;
    String tambahan= "";

    do {
      System.out.print(" jumlah tiket yang terjual hari ini: ");
      jumlahTiket = sc.nextInt();

      if (jumlahTiket <= 0) {
    
        continue;
      }

      totalHarga = hargaTiket * jumlahTiket;
      
      if (jumlahTiket > 4) {
        if(jumlahTiket > 10) {
          totalBayar = totalHarga * 0.85;
        } else {
          totalBayar = totalHarga * 0.90;
        }
      } else {
        totalBayar = totalHarga;
      }
      
      totalTiket += jumlahTiket;
      bayarAkhir += totalBayar;
      System.out.println("Total biaya  tiket yang terjual: " + totalBayar);

      System.out.print("Apakah ada pelanggan tambahan? (ya/tidak): ");
      tambahan = sc.next();

    } while (tambahan.equalsIgnoreCase("ya"));

      System.out.println("");
      System.out.println("Penjualan tiket hari ini      : " + totalTiket);
      System.out.println("total harga tiket yang terjual: " + bayarAkhir);

  } 
}
  
  

