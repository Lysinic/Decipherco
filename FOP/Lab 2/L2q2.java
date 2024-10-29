package tutorial2;

import java.util.Scanner;

/**
 *
 * @author alief
 */
public class L2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, d, r, y, m;
        
        System.out.print("Please enter the price of the car(RM): ");
        p = sc.nextDouble();
        System.out.print("Please enter the down payment(RM): ");
        d = sc.nextDouble();
        System.out.print("Please enter the interest rate(%): ");
        r = sc.nextDouble();
        System.out.print("Please enter the loan duration(year): ");
        y = sc.nextDouble();

        m = (p-d) * (1 + r*y/100)/(y*12);
        
        System.out.printf("\nMonthly payment for your car is %.2f", m);
         
    }
}
