
package tutorial6;

import java.util.Scanner;

public class L6q5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, count=0;
        
        do {
            a = (int)(Math.random()*13);
            b = (int)(Math.random()*13);
            System.out.printf("%2d x %2d = ", a, b);
            c = sc.nextInt();
            
            if (check(a,b,c)) {
                count++;
            }
            
        } while(c>=0);
    
        System.out.println("Your score is " + count);
    }
    public static boolean check(int a, int b, int c) {
        return a*b == c;
    }
    
}
