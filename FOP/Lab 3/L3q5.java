
package tutorial3;
import java.util.Scanner;

public class L3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        
        System.out.print("Please enter a: ");
        a = sc.nextDouble();
        System.out.print("Please enter b: ");
        b = sc.nextDouble();
        System.out.print("Please enter c: ");
        c = sc.nextDouble();
        System.out.print("Please enter d: ");
        d = sc.nextDouble();
        System.out.print("Please enter e: ");
        e = sc.nextDouble();
        System.out.print("Please enter f: ");
        f = sc.nextDouble();
        
        if (a*d-b*c == 0) {
            System.out.println("\nThe equation has no solution.");
        } else {
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            System.out.printf("\nX = %.2g\nY = %.2g\n", x, y);
        }
        
    }
}
