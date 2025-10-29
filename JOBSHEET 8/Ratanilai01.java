import java.util.Scanner;

public class Ratanilai01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i,j;
    float nilai,totalNilai,rataNilai;

    i = 1;
    while (i <= 5) {

      totalNilai = 0;

      for (j = 1 ; j <= 5 ; j++) {
        System.out.print("Masukan nilai ke-" + j + " untuk siswa ke-" + i + " : ");
        nilai = sc.nextFloat();
        totalNilai = totalNilai + nilai;
      }

      rataNilai = totalNilai / 5;
      System.out.println("Rata-rata nilai siswa ke-" + i + " : " + rataNilai);
      i++;
    }
   
  }
}
