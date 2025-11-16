import java.util.Scanner ;

public class Tugas3_01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in) ;

    String menu [] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
    String nama ;
    for (int i = 0 ; i < menu.length ; i++) {
      System.out.println((i + 1) + ". " + menu[i]);
    
  }

  System.out.print("\n Daftar menu yang ingin dicari : ") ;
  nama = sc.nextLine() ;

  boolean n = false ;
  int indeks = 0 ;

  for (int i = 0 ; i < menu.length ; i++) {
    if (menu[i].equalsIgnoreCase(nama)) {
      n = true ;
      indeks = i ;
      break ;
    }
  }

  if (n) {
    System.out.println(" \"" + menu[indeks] + "\" tersedia pada menu ke-" + (indeks + 1));
  } else {
    System.out.println(" \"" + nama + "\" tidak tersedia di menu.");
  }
 }
}
