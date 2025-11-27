import java.util.Scanner ;
public class hitungTotalHarga01 {

  static Scanner sc = new Scanner (System.in) ;

 public static int hitungTotalHarga (int pilihanMenu, int banyakItems) {

  int hargaItems[] = {15000, 20000, 22000, 12000, 10000,18000};

  int totalHarga = hargaItems[pilihanMenu - 1] * banyakItems ;
  return totalHarga ; 

 }

 public static void main(String[] args) {
  
 System.out.print("\nMasukan nomor menu yang ingin Anda pesan :") ;
 int pilihanMenu = sc.nextInt() ; 
 System.out.print("Banyaknya jumlah item yang ingin anda pesan : ") ;
  int banyakItems = sc.nextInt() ;

  int totalHarga = hitungTotalHarga (pilihanMenu, banyakItems) ;

  System.out.println("\nTotal harga yang harus dibayar : Rp." + totalHarga) ;

  sc.close();
 }
} 

  

