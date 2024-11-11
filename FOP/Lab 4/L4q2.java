
package tutorial4;

import java.util.Scanner;

public class L4q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, sum=0;
        
        System.out.print("Enter an integer n: ");
        n = sc.nextInt();
        
        
        for (int i=1; i<=n; i++) {
        
            sum += i*(n+1-i);
          
        }
        
        System.out.println("Sum: " + sum);
    
    }
}
