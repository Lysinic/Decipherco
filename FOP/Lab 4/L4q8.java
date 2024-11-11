
package tutorial4;

import java.util.Scanner;


public class L4q8 {
    public static void main(String[] args) {
        int a, r, i;
        
        a = (int)(Math.random()*101);

        for (int b=2; b<a; b++) {
            
            for (i = 2; i<=Math.sqrt(b); i++) {
                if (b%i==0) {
                    break;
                }
            }
            if (b%i!=0 || b==2) {   // for this alg, 2 is skipped eventhough it is a prime
                System.out.println(b);
            }
            
        }
        
    }
}
