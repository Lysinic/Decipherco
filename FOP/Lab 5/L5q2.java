package tutorial5;

import java.util.Arrays;

public class L5q2 {

    public static void main(String[] args) {        
        int[] arr = new int[10];
        
        for (int i=0; i<10; i++) {
            arr[i] = (int)(Math.random()*21); 
        }
        
        Arrays.sort(arr);
        for (int i=0; i<9; i++) {
            while(arr[i] == arr[i+1]) {
                arr[i] = (int)(Math.random()*21);
                Arrays.sort(arr);
                i=0;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
