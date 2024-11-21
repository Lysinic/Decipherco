
package tutorial6;

public class L6q3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Before swapping:");
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
            System.out.print(arr[i]+" ");
        }
        
        revarr(arr);
        
        System.out.println("\n\nAfter swapping:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void revarr(int[] arr) {
        int temp;
        for (int i = 0; i < 5; i++) {
            temp=arr[i];
            arr[i] = arr[9-i];
            arr[9-i] = temp;
        }
    
    }
    
}
