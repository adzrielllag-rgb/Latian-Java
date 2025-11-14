import java.util.Scanner;

public class SearchNilai01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    int arrNilai []  ;
    int key ;
    int hasil = 0 ;

    System.out.print("Masukan niali yang akan diinput : ");
    int n = sc.nextInt() ;
    arrNilai = new int[n] ;

    for (int i = 0; i < arrNilai.length ; i++) {
      System.out.print("Masukan nilai Mahasiswa ke-" + i + " : ");
      arrNilai[i] = sc.nextInt();
    }

    System.out.println();

    System.out.print("Masukan nilai yang akan dicari : ");
    key = sc.nextInt() ;

    for (int i = 0; i < arrNilai.length ; i++) {

      if (key == arrNilai[i]) {
        hasil = i ;
        
        
        System.out.println("Nilai " +key + ", merupakan nilai mahasiswa  ke-" +hasil);
 
      

    }
    

  }


  
}
}
