import java.util.Scanner;

public class ArrayRataNilai01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int nilaiMhs[] = new int [10] ;
    int kelulusan = 0 , gagal = 0 , total1 = 0 , total2 = 0;
    double total = 0 ;
    double rata , rata1 = 0 , rata2 = 0 ;

    for (int i = 0; i < nilaiMhs.length ; i++) {

      System.out.print("Masukan nilai mahasiswa ke-" +i+ " : ");
      nilaiMhs[i] = sc.nextInt();
    }
      System.out.println() ;

      for (int k=0 ; k < nilaiMhs.length ; k++) {
        if (nilaiMhs[k] > 70) {
          kelulusan ++ ;
          total1 += nilaiMhs[k] ;


        }
        if (nilaiMhs[k] <= 70) {
          gagal ++ ;
          total2 += nilaiMhs[k] ;
        }
      }

      for (int n = 0; n < nilaiMhs.length ; n++) {
        if (nilaiMhs[n] > 70) {
          rata1 = total1 / kelulusan ;
        }

        if (nilaiMhs[n] <= 70) {
          rata2 = total2 / gagal ;
        }

      }

      System.out.println("Rata-rata nilai lulus : " +rata1);
      System.out.println("Rata-rata nilai tidak lulus : " +rata2);
    
  }
  
  }


