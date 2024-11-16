
package tutorial5;

import java.util.Scanner;

public class L5q3 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employee: ");
        int n = sc.nextInt();
        
        int[][][] arr = new int[n][24][8];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 24; j++) {
                arr[i][j][0] = j;
            }
        }

        int ranhour;
        for (int i = 0; i < n; i++) {
            ranhour = (int)(Math.random()*24);
            for (int j = 1; j<8; j++) {
                for (int k=0; k<8; k++) { 
                    ranhour++;
                    if (ranhour > 23) {
                        ranhour = 0;
                    }
                    arr[i][ranhour][j]++;
                }
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (int)(i+1));
            System.out.println("Hour Sun Mon Tue Wed Thu Fri Sat");
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 8; k++) {
                    System.out.printf("%3d ", arr[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("Total hours = " + 8*7 + "\n");
        }
        
    }
}
