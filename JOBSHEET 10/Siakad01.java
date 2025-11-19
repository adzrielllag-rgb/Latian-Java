import java.util.Scanner;

public class Siakad01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;

    int nilai[][] = new int [4][3] ;

    for ( int i = 0 ; i < nilai.length ; i++ ) {
      System.out.println("input nilai mahasiswa ke-" + (i+1) ) ;

      for ( int j = 0 ; j < nilai[i].length ; j++ ) {
        System.out.print("nilai mata kuliah ke-" + (j+1) + " : " ) ;
        nilai[i][j] = sc.nextInt() ;
      }
    }

    for (int i = 0 ; i < nilai.length ; i ++) {
      System.out.println("input mahasiswa ke-" + (i+1) ) ;
      double totalPerSiswa = 0 ;

      for ( int j = 0 ; j < nilai[i].length ; j++ ) {
        System.out.print("nilai mata kuliah ke-" + (j+1) + " : "  ) ;
        nilai[i][j] = sc.nextInt() ; 
        totalPerSiswa += nilai[i][j] ; 
    }
    
    System.out.println("Nilai Rata-rata; "+ totalPerSiswa/3 ) ;

  }

  System.out.println("\n====================================") ;
  System.out.println("Rata-rata nilai setiap mata kuliah: ") ; 

  for ( int j = 0 ; j < 3 ; j++ ) {
    double totalPerMataKuliah = 0 ;

    for ( int i = 0 ; i < 4 ; i++ ) {
      totalPerMataKuliah += nilai[i][j] ;
    }

    System.out.println("Mata kuliah ke" + (j+1) + " : " + totalPerMataKuliah/4 ) ;
  }

  sc.close();
 }
} 

