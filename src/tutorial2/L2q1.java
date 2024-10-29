
package tutorial2;
import java.util.Scanner;

/**
 *
 * @author alief
 */
public class L2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah, cel;
        
        System.out.printf("Please enter temperature in fahrenheit: ");
        fah = sc.nextDouble();
        cel = (fah-32)/1.8;
        
        System.out.printf("\n%fF is equal to %.2fC\n", fah, cel);
    
    
    }
}
