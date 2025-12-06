import java.util.Scanner;

public class pengunjungCafe01 {

  static int banyak(int jumlahPengunjung ) {
    
   return jumlahPengunjung;
    }
  
  static void namaPengunjung(String [] nama, int jumlahPengunjung) {

    Scanner sc = new Scanner(System.in);
  
    for (int i = 0 ; i < jumlahPengunjung ; i++ ) {
      System.out.print("Masukkan nama pengunjung ke-" + (i+1) + ": ");
      nama [i]= sc.nextLine();
    }
  }   
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan banyaknya pengunjung cafe hari ini: ");
    int banyak = sc.nextInt();
    sc.nextLine();

    String [] daftarPengunjung = new String[banyak];
    
    System.out.println("Masukkan nama pengunjung: ");
    namaPengunjung(daftarPengunjung, banyak);

    System.out.println("\nDaftar nama pengunjung cafe hari ini: ");
    for ( int i = 0 ; i < banyak ; i++ ) {
      System.out.println("Pengunjung ke-" + (i+1) + ": " + daftarPengunjung[i]);
    }
    sc.close();
    
  }
  
}
