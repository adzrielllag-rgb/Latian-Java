import java.util.Scanner;
public class percobaan2_01 {

  static int hitungpangkat(int x, int y) {
    if (y == 0) {
        return(1) ;
    } else {
        return (x * hitungpangkat(x, y-1));
    } 
  }
  
  static void cetakDeret(int x, int y) {
    int hasil = hitungpangkat(x, y);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < y; i++) {
      sb.append(x).append("x");
    }
    sb.append("1 = ").append(hasil);
    System.out.println(sb.toString());
  }
  

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in); 

    int bilangan,pangkat;

    System.out.print("Bilangan yang dihitung :\n");
    bilangan = sc.nextInt();
    System.out.print("Pangkat :");
    pangkat = sc.nextInt();

    cetakDeret(bilangan, pangkat);
    
    sc.close();
  }
  
}
