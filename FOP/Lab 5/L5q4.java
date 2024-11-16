
package tutorial5;

public class L5q4 {
    public static void main(String[] args) {        
        int[][] arr = {{1,5,7},
                       {3,6,9},
                       {5,3,8}};
        int[][] arr2 = new int[3][3];

        System.out.println("Before rotation: ");
        for (int i=0; i<3; i++) {
            for (int j=2; j > -1; j--) {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println("");
        }              

        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
               arr2[i][j] = arr[j][i]; 
            }
        }
        
        System.out.println("After 90 rotation: ");
        for (int i=0; i<3; i++) {
            for (int j=2; j > -1; j--) {
                System.out.print(arr2[i][j] + " "); 
            }
            System.out.println("");
        }        
        
        
        
    }
    
}
