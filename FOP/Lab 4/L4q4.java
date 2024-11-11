
package tutorial4;

import java.util.Scanner;


public class L4q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, may, aug, count;
        
        
        
        System.out.print("Enter the first day of the year(non leap): ");
        day = sc.nextInt();
        
        //may
        may = (31+28+31+30)%7; //1
        count=1;
        
        System.out.println("\n\n          May\n  S  M  T  W  T  F  S");
        
        for (int i = 0; i < (may+day)%7; i++) {
            System.out.print("   ");
        }
        while (count<=31) {
            System.out.printf("%3d", count);
                      
            if ((day+may+count)%7==0) {
                System.out.println(" ");
            }
            
            count++;
        }
        
        
        
        //aug
        aug = (31+28+31+30+31+30+31)%7; //2
        count=1;
        
        System.out.println("\n\n\n         August\n  S  M  T  W  T  F  S");
        
        for (int i = 0; i < (aug+day)%7; i++) {
            System.out.print("   ");
        }
        while (count<=31) {
            System.out.printf("%3d", count);
                      
            if ((day+aug+count)%7==0) {
                System.out.println(" ");
            }
            
            count++;
        }
        
        System.out.println("\n\n");

    }
}
