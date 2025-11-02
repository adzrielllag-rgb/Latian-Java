import java.util.Scanner;
public class Tugas1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int i, j,k,n1,n2 ;
    
    System.out.print("Masukkan nilai n (minimal 3): ");
    n1 = sc.nextInt();
    
    System.out.print("Masukkan nilai n (minimal 3): ");
    n2 = sc.nextInt();

    do {
      if (n1  < 3) {
            
            continue;
        }
        
        for ( i = 1; i <= n1; i++) {
          for ( j = 1; j <= n1; j++) {
                if (i == 1 || i == n1 || j == 1 || j == n1) {
                    System.out.print(n1 + " ");
                } else {
                    System.out.print("  ");
                }
              }
              System.out.print(" ");
              

     if (n2 < 3) {
            
            continue;
        }

            for ( k = 1; k <= n2; k++) {
                if (i == 1 || i == n1 || k == 1 || k == n2) {
                    System.out.print(n2 + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
          } 

         } while (n1 < 3 || n2 < 3);

    sc.close();
    
        }
    }

  
  

