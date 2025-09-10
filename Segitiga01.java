import java.util.Scanner;

public class Segitiga01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int alas;
    int tinggi;
    float luas;

    System.out.println("masukan alas : ");
    alas =  sc.nextInt();
    System.out.println("masukan tinggi : ");
    tinggi = sc.nextInt();

    luas = alas * tinggi /2 ;
    System.out.println("luas segitiga: " +luas);
  }
}
