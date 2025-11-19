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

  sc.close();
 }
} 

