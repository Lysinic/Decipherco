package tutorial2;

import java.util.Scanner;

public class L2q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, r3, sum;
        double ave;
        
        r1 = (int)(Math.random()*41 + 10); //Creates number in range [0,1), multiply by 40 [0,40), add 10 [10,50)
        r2 = (int)(Math.random()*41 + 10);
        r3 = (int)(Math.random()*41 + 10);
       
        
        sum = r1+r2+r3;
        
        ave = (double)sum/3;
        
        System.out.printf("\nThe 3 numbers are %d, %d and %d. \nSum: %d\nAverage: %.2f\n", r1, r2, r3, sum, ave);
        
    }
}
