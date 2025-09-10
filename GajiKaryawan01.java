import java.util.Scanner;
public class GajiKaryawan01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int gajipokok;
    double bonus, total_gaji;
    double tunjTransport=600000;
    double tunjMakan=400000;

    gajipokok=sc.nextInt();
    bonus=0.05*gajipokok;
    total_gaji=gajipokok+tunjTransport+tunjMakan+bonus-(0.1*gajipokok);

    System.out.println("Bonus Bulanan anda adalah " + bonus);
    System.out.println("Total Gaji Bulanan anda adalah " + total_gaji);
  }
}
