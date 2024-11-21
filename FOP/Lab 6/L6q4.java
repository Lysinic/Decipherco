
package tutorial6;

public class L6q4 {
    public static void main(String[] args) {
        System.out.println("GCD of 24 and 8 is " + gcd(24,8));
        System.out.println("GCD of 625 and 200 is " + gcd(625,200));
    }
    
    public static int gcd(int a, int b) {
        int temp, gcd;
        if (a<b) {
            temp=a;
            a=b;
            b=temp;
        }
        
        while(a%b != 0) {
            temp=b;
            b=a%b;
            a=temp;
        }
        
        return b;
    }
}
