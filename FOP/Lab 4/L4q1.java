
package tutorial4;

import java.util.Scanner;

public class L4q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        
        for (int i=1; i<=a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
                
            }
            
        }
        
        
    }
    
}
