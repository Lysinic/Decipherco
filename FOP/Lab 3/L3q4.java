
package tutorial3;
import java.util.Scanner;

public class L3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.print("Player 1: Press enter to roll your dice: ");
        sc.nextLine();
        a = (int)(Math.random()*6+1);
        b = (int)(Math.random()*6+1);
        System.out.printf("Your dice rolls are %d and %d.\n", a, b);
        
        System.out.print("\nPlayer 2: Press enter to roll your dice: ");
        sc.nextLine();
        c = (int)(Math.random()*6+1);
        d = (int)(Math.random()*6+1);
        System.out.printf("Your dice rolls are %d and %d.\n", c, d);
        
        if (a+b > c+d){
            System.out.printf("\nPlayer 1 wins. %d vs %d\n", a+b, c+d);
        } else if (c+d > a+b) {
            System.out.printf("\nPlayer 2 wins. %d vs %d\n", c+d, a+b);
        } else {
            System.out.printf("\nGame is draw. %d vs %d\n", a+b, c+d);
        }
    }
}
