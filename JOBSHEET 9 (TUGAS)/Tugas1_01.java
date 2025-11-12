import java.util.Scanner;

public class Tugas1_01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in) ;

    int jmlNilai[] ;
    int nilai, total = 0, jmlInput , nilai_tertinggi = 0 , nilai_terendah = 100 ;
    double rata ;


    System.out.print("Masukan jumlah nilai yang akan diinput : ");
    jmlInput = sc.nextInt() ;

    jmlNilai = new int[jmlInput];

    for (int i = 0; i < jmlInput ; i++) {
      System.out.print("Masukan nilai ke-" + i + " : ");
      nilai = sc.nextInt() ;
      jmlNilai[i] = nilai ;

    }

    System.out.println() ;


    for (int i = 0; i < jmlInput ; i++) {

      System.out.println("nilai ke-" + i + " : " + jmlNilai[i]);
      total += jmlNilai[i] ;
      
    }

    for (int i = 0; i < jmlInput ; i++) {

      if (jmlNilai[i] > nilai_tertinggi) {
        nilai_tertinggi = jmlNilai[i] ;
      }
      if (jmlNilai[i] < nilai_terendah) {
        nilai_terendah = jmlNilai[i] ;
      }

    }

    System.out.println() ;
    System.out.println("Nilai tertinggi adalah : " + nilai_tertinggi);
    System.out.println("Nilai terendah adalah : " + nilai_terendah);

    rata =  total / jmlInput ;
    System.out.println("Rata-rata nilai adalah : " + rata);

    
   sc.close();
    
  }
  
}
