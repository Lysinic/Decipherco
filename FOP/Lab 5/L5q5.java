package tutorial5;

import java.util.Scanner;

public class L5q5 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = new int[20];
        System.out.println("Before bubble sorting: ");
        for (int i = 0; i < 20; i++) {
            arr1[i] = (int)(Math.random()*100);
            System.out.print(arr1[i] + " ");
        }     
        
        int[] arr = arr1.clone();
        
        //sorting alg bubble sort
        int temp;
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1.length-1-i; j++) {
                if (arr1[j] < arr1[j+1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        System.out.println("\n\nAfter bubble sorting: ");
        for (int pop: arr1) {
            System.out.print(pop + " ");
        }    
        
        System.out.print("\n\nEnter a number to find: ");
        int num = sc.nextInt();
         
        //linear search
        for(int i=0; i<arr.length; i++){
            if (arr[i] == num) {
                System.out.println(arr[i]);
                System.out.println(i+1 + " loop(s)");
                break;
            }
        }
        
        
        //binary search
        int floor=0, ceil=arr1.length-1, mid = floor + (ceil-floor)/2, count=0;
        while(floor <= ceil) {
            mid = floor + (ceil-floor)/2;
            count++;
            if (arr1[mid] == num) {
                break;
            } else if (arr1[mid] < num) {
                ceil = mid - 1;
            } else {
                floor = mid + 1;
            }
        }
        
        
        System.out.println(arr1[mid]);
        System.out.println(count+1 + " loop(s)");
            
       
    
    }
}
