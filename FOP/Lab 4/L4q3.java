
package tutorial4;

import java.util.Scanner;

public class L4q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score=0, sum=0, sumsq=0, maxscore=0, minscore=Double.MAX_VALUE;
        int count=0;
        
        System.out.print("Enter a number(-1 to quit): ");
        score = sc.nextDouble();
        
         while (score >= 0) {
            if (score < minscore) {
                minscore = score;
            }
            if (score > maxscore) {
                maxscore = score;
            }

            sum += score;
            sumsq += score*score;
            count++;
            
            System.out.print("Enter a number(-1 to quit): ");
            score = sc.nextDouble();
            
        }
        
        if (count>1) {
            double s = Math.sqrt((sumsq - sum*sum/count)/(count-1));

            System.out.println("Maximum score: " + maxscore);
            System.out.println("Minimum score: " + minscore);
            System.out.printf("Average: %.2f\n", sum/count);
            System.out.printf("Standard deviation: %.2f\n", s);
        } else {
            System.out.println("Not enough data.");
        }


    
    }
}
