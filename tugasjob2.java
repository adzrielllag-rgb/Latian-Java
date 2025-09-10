import java.util.Scanner;
public class tugasjob2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jarak,rataBensin=2,hargaBensin=10000;
    double bensin,biayaBensin;

    System.out.println("Masukkan Jarak Tempuh (dalam km) : ");
    jarak=sc.nextInt();
    bensin=jarak/rataBensin;
    biayaBensin=bensin*hargaBensin;
    System.out.println("Biaya Bensin yang harus anda keluarkan adalah " + biayaBensin);

    sc.close();
   }
}
