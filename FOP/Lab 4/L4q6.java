
package tutorial4;

import java.util.Scanner;


public class L4q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, s=0;
        
        System.out.print("Select a maximum for a random non-negative number: ");
        a = sc.nextInt();
        a = (int)(Math.random()*(a+1));
        
        System.out.println("The random number is " + a);
        
        while (a > 0) {
            a = a / 10;
            s++;
        }
        
        System.out.println("It has " + s + " digits");
        
        
    }
}    

