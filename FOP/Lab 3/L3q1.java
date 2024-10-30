
package tutorial3;
import java.util.Scanner;

public class L3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String oper;
        char o;
        
        System.out.print("Enter first integer number: ");
        a = sc.nextInt();
        System.out.print("Enter second integer number: ");
        b = sc.nextInt();
        
        System.out.print("Enter operand: ");
        oper = sc.next();
        o = oper.charAt(0);
        
        switch(o){
            case '+':
                System.out.printf("%d %c %d = \n", a, o, b, a+b);
                break;
            case '-':
                System.out.printf("%d %c %d = \n", a, o, b, a-b);
                break;
            case '*':
                System.out.printf("%d %c %d = \n", a, o, b, a*b);
                break;        
            case '/':
                if (b == 0) {
                    System.out.println("Denominator cannot be 0");
                    break;
                } else {
                    System.out.printf("%d %c %d = %.2f\n", a, o, b, (float)a/b);
                    break;  
                }
            case '%':
                if (b == 0) {
                    System.out.println("Denominator cannot be 0");
                    break;
                } else {
                    System.out.printf("%d %c %d = %d\n", a, o, b, a%b);
                    break;        
                }
            default:
                System.out.println("Invalid operand.");
        }
    }
}
