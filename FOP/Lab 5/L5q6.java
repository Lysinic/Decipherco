package tutorial5;

import java.util.Scanner;

public class L5q6 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of row for pascal triangle: ");
        int size = sc.nextInt();
        
        int arr[][] = new int[size][size+1];
        
        arr[0][1] = 1;
        if (size > 1) {
            arr[1][1] = 1;
            arr[1][2] = 1;
        }
        
        for (int i = 2; i < size; i++) {
            for (int j = 1; j < size+1; j++) {
                System.out.println("");
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];                        
            }
        }

        for (int a = 0; a < size; a++) {
            for (int b = 1; b < size+1; b++) {
                System.out.printf("%-3d", arr[a][b]);
            }
            System.out.println("");
        }
        
    }
}
