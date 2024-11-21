
package tutorial6;

public class L6q1 {

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            System.out.println(trin(i));
        }
        
    }
    
    public static int trin(int n) {
        for (int i = n-1; i >0; i--) {
            n += i;
        }
        return n;
    }
    
}
