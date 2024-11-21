
package tutorial6;

public class L6q2 {
    public static void main(String[] args) {
        multiPrint(1, 'T');
        multiPrint(2, 'T');
        multiPrint(3, 'T');
        multiPrint(4, 'T');
        multiPrint(3, 'T');
        multiPrint(2, 'T');
        multiPrint(1, 'T');
        
        
        System.out.print("   ");
        multiPrint(1, 'D');
        System.out.print("  ");
        multiPrint(3, 'D');
        System.out.print(" ");
        multiPrint(5, 'D');
        multiPrint(7, 'D');
        System.out.print(" ");
        multiPrint(5, 'D');
        System.out.print("  ");
        multiPrint(3, 'D');
        System.out.print("   ");
        multiPrint(1, 'D');
        
    }
        
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println("");
    }    
        
    
}
