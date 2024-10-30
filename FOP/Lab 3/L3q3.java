
package tutorial3;
import java.util.Scanner;

public class L3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales, com=0;
        System.out.print("Enter your sales amount: ");
        sales = sc.nextDouble();
        
        
        if (sales >= 0 && sales <= 100) {
            com = 0.05*sales;
        } else if (sales >= 0 && sales <= 500) {
            com = 0.075*sales;
        } else if (sales >= 0 && sales <= 1000) {
            com = 0.1*sales;
        } else if (sales > 1000) {
            com = 0.125*sales;
        } else {
            System.out.println("Your sales is invalid.");
        }
    
        if (sales >= 0)
            System.out.printf("Your commission for your RM%.2f sales is RM%.2f\n", sales, com);
    
    }
}
