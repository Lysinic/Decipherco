
package tutorial3;
import java.util.Scanner;

public class L3q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad, x, y;
        
        System.out.print("Enter the radius of your circle: ");
        rad = sc.nextDouble();
        System.out.print("Enter the x coordinate of your point: ");
        x = sc.nextDouble();        
        System.out.print("Enter the y coordinate of your point: ");
        y = sc.nextDouble();        
        
        if (Math.sqrt(x*x + y*y) < rad) {
            System.out.printf("\nYour point(%.2f,%.2f) lies inside the circle with radius %.2f\n", x, y, rad);
        } else if (Math.sqrt(x*x + y*y) > rad) {
            System.out.printf("\nYour point(%.2f,%.2f) lies outside the circle with radius %.2f\n", x, y, rad);
        } else {
            System.out.printf("\nYour point(%.2f,%.2f) lies on the circumference of the circle with radius %.2f\n", x, y, rad);
        }
    }
}
