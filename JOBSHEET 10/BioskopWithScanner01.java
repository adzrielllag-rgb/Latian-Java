import java.util.Scanner;

public class BioskopWithScanner01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;
    
    String nama , next ;
    int baris , kolom ;

    String penonton [][] = new String [4][2] ;

    while (true) {
      System.out.print("Masukan nama: ") ;
      nama = sc.nextLine() ;
      System.out.print("MAsukan Baris; ") ;
      baris = sc.nextInt() ;
      System.out.print("Masukan Kolom: ") ;
      kolom = sc.nextInt() ;
      sc.nextLine() ;

      penonton[baris-1][kolom-1] = nama ;

      System.out.print("Apakah anda ingin menambah data lagi (y/n)? ") ;
      next = sc.nextLine() ;
      if (next.equalsIgnoreCase("n")) {
        break ;
      }
    }

  }
  
}
