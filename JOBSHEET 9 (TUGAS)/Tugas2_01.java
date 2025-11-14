import java.util.Scanner;

public class Tugas2_01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;

    double harga [] ;
    double harga1[] ;
    String makanan []  ;
    String minuman []  ;
    double total_harga = 0 ;
    double total_harga1 = 0 ;

    System.out.println("=============  PESANAN  =============");
    System.out.println();

    System.out.print("Masukan nama pembeli : ");
    String nama = sc.nextLine() ;

    System.out.print("Jumlah makanan yang dipesan : ");
    int jmlMakanan = sc.nextInt() ;
    makanan = new String [jmlMakanan] ;

    System.out.print("Jumlah minuman yang dipesan : ");
    int jmlMinuman = sc.nextInt() ;
    minuman = new String [jmlMinuman] ;

    harga = new double [jmlMakanan] ;
    harga1 = new double [jmlMinuman] ;

    System.out.println();

    for (int i = 0; i < jmlMakanan ; i++) {
      System.out.print("Masukan nama makanan ke-" + i + " : ");
      makanan[i] = sc.nextLine() ;

      System.out.print("Masukan harga makanan     : Rp.");
      harga[i] = sc.nextDouble() ;
    }

    System.out.println();

     for (int i = 0; i < jmlMinuman ; i++) {
       System.out.print("Masukan nama minuman ke-" + i + " : ");
       minuman[i] = sc.nextLine() ;

       System.out.print("Masukan harga minuman     : Rp.");
       harga1[i] = sc.nextDouble() ;
     }

      System.out.println();
      System.out.println("=============  STRUK PESANAN  =============");
      System.out.println("Nama Pembeli : " + nama);
      System.out.println();

    for (int i = 0; i < jmlMakanan ; i++) {
      System.out.println("Makanan yang dipesan  : " + makanan[i] + " " + "  Rp." + harga[i]);
    }

    for (int i = 0; i < jmlMinuman ; i++) {
      System.out.println("Minuman yang dipesan  : " + minuman[i] + " " + "  Rp." + harga1[i]);
    }
    System.out.println();

    for (int i = 0; i < jmlMakanan ; i++) {
      total_harga += harga[i];
    }

    for (int i = 0; i < jmlMinuman ; i++) {
      total_harga1 += harga1[i];
    }

    System.out.println("Total harga makanan : Rp." + total_harga);
    System.out.println("Total harga minuman : Rp." + total_harga1);
    System.out.println("Total harga yang harus dibayar : Rp." + (total_harga + total_harga1));

    sc.close();
  }
  
}
  
