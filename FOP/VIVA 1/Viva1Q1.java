package viva1;

import java.util.Scanner;

public class Viva1Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0;
        String a;
        
        
        System.out.print("Enter a number: ");
        a = sc.nextLine();
        a = a.trim();           //remove any whitespace mistakenly added by the user
  
        
        for (int i = a.length() - 1; i > -1; i--) {    // -1 to make sure we can used text.charAt() directly and prevent out of bounds
            sum += a.charAt(i) - 48;                    // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
        }
        
        
        while (sum > 9) {       // stop once we've hit single digit
            num=sum;            // to reset the values
            sum=0;
            
            do {
                sum += num%10;  // add the remainder(add every digit in the number)
                num /= 10;      // make the number smaller so we can move on to the next digit
            } while (num != 0);
            
        }
        
        
        System.out.println("Sum of digits until single digit: " + sum);
        
    }
}
