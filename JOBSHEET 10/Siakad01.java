import java.util.Scanner;

public class Siakad01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in) ;

    int nilai[][] = new int [][] ;

    System.out.print("Masukkan jumlah mahasiswa: ") ;
    int mhs = sc.nextInt() ;

    System.out.print("\nMasukkan jumlah mata kuliah: ") ;
    int matkul = sc.nextInt() ;

    nilai = new int[mhs][matkul] ;


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
    
    System.out.println("Nilai Rata-rata; "+ totalPerSiswa/nilai[i].length ) ;

  }

  System.out.println("\n====================================") ;
  System.out.println("Rata-rata nilai setiap mata kuliah: ") ; 

  for ( int j = 0 ; j < nilai[0].length ; j++ ) {
    double totalPerMataKuliah = 0 ;

    for ( int i = 0 ; i < nilai.length ; i++ ) {
      totalPerMataKuliah += nilai[i][j] ;
    }

    System.out.println("Mata kuliah ke" + (j+1) + " : " + totalPerMataKuliah/nilai.length ) ;
  }

  sc.close();
 }
} 

