package tutorial2;

import java.util.Scanner;

public class L2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int)(Math.random()*10001);
        int sa, pu, ra, ri, puri, sum;
        
        puri = rand/10000;
        ri = rand%10000 / 1000;
        ra = rand%1000 / 100;
        pu = rand%100 / 10;
        sa = rand%10;
        
        sum = puri + ri + ra + pu + sa;
        
        System.out.printf("Number generated: %d\nSum: %d\n", rand, sum);

    }
}
