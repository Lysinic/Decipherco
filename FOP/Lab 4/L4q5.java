
package tutorial4;

import java.util.Scanner;


public class L4q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int roll1, roll2, sum1=0, sum2=0;
        
        while (sum2<101) {
            System.out.print("\nPlayer 1 please press enter to roll: ");
            sc.nextLine();
            roll1 = (int)(Math.random()*6+1);
            System.out.println("1 Roll: " + roll1);
            sum1+=roll1;
            while (roll1>5) {
                roll1 = (int)(Math.random()*6+1);
                System.out.println("1 Roll: " + roll1);
                sum1+=roll1;
            }
            System.out.println("1 Sum: " + sum1);
            
            if (sum1 >100)
                break;
            
            System.out.print("Player 2 please press enter to roll: ");
            sc.nextLine();
            roll2 = (int)(Math.random()*6+1);
            System.out.println("2 Roll: " + roll2);
            sum2+=roll2;
            while (roll2>5) {
                roll2 = (int)(Math.random()*6+1);
                System.out.println("2 Roll: " + roll2);
                sum2+=roll2;
            }
            System.out.println("2 Sum: " + sum2);
            
        }
  
        if (sum1>100) {
            System.out.println("\nPlayer 1 wins");
        } else {
            System.out.println("\nPlayer 2 wins");
        }
        
    }
    
}

