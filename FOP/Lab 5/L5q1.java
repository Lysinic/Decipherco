package tutorial5;

import java.util.Scanner;

public class L5q1 {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int sum=0, max, min;
        
        
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        arr[0] = (int)(Math.random()*100);
        min = arr[0];
        max = arr[0];
        sum += arr[0];
        
        for (int i = 1; i < n; i++) {
            arr[i] = (int)(Math.random()*100);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum+= arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMin element is: " + min);
        System.out.println("Max element is: " + max);
        System.out.printf("Average element is: %.2f\n", (double)sum/arr.length);

        
        
    }
    
}
