import java.util.Scanner;
public class tugasjob1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int harga,uangMuka,bulan,sisaCicilan;
    double bunga=0.01,totalBunga,totalBayar;
    
    System.out.println("Masukkan Harga Barang : ");
    harga=sc.nextInt();
    System.out.println("Masukkan Uang Muka : ");
    uangMuka=sc.nextInt();
    System.out.println("Bulan : ");
    bulan=sc.nextInt();
    sisaCicilan=harga-uangMuka;
    totalBunga=sisaCicilan*(bunga*bulan);
    totalBayar=sisaCicilan+totalBunga;
    totalBayar /= bulan;
    System.out.println("Sisa yang harus dibayar : " + totalBayar);
  }
}
