package tutorial2;

import java.util.Scanner;

public class L2q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double q, m, it, ft;
        
        System.out.print("Enter the amount of water in gram: ");
        m = sc.nextDouble();
        System.out.print("Enter the initial temperature(F): ");
        it = sc.nextDouble();
        System.out.print("Enter the final temperature(F): ");
        ft = sc.nextDouble();
    
        q = m/1000 * ((ft - it)/1.8) * 4184;
        
        System.out.printf("The energy needed is %e J", q);

    }
}
