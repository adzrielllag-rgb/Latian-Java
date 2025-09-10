import java.util.Scanner;
public class menghitungtotalbayar01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double harga;
    double potongan;
    double jml_bayar;
    double Diskon=0.15;

    harga=sc.nextInt();
    potongan=Diskon*harga;
    jml_bayar=harga-potongan;
    System.out.println("Jumlah yang harus anda Bayar adalah " + jml_bayar);
  }
}
