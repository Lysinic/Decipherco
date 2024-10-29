package tutorial2;

import java.util.Scanner;

public class L2q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s, temp;
        
        System.out.print("Enter time in seconds: ");
        temp = sc.nextInt();
        
        h = temp/(3600); //seconds/60/60 = hours
        m = temp/60 - h*60;
        s = temp - h*60*60 - m*60;
        
        System.out.printf("%d seconds is equal to %d hour(s) %d minute(s) %d second(s)", temp, h, m, s);
    }
}
