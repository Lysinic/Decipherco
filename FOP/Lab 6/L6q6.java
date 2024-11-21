
package tutorial6;

import java.util.Scanner;

public class L6q6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Palindromic primes:");
        int ctr=0;
        for (int i = 2; ctr < 20; i++) {
            if(palinPrime(i)){
                System.out.print(i + " ");
                ctr++;
            }
        }
        
        System.out.println("\nEmirp:");
        ctr=0;
        for (int i = 2; ctr < 20; i++) {
            if(emirp(i)){
                System.out.print(i + " ");
                ctr++;
            }
        }
        System.out.println("");
    }
    public static boolean palinPrime(int a) {
        boolean check = true;
        
        if (a<2)
            check=false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0) {
                check = false;
                break;
            }
        }
        
        int intcount= (int)(Math.log10(a)+1);
        for (int i = 0; i < intcount; i+=2) {
            if ((int)(a/Math.pow(10, intcount-1-i)) != (int)(a%10)) {
                check=false;
                break;
            }
            a = a - (int)(a/Math.pow(10, intcount-1-i))*(int)Math.pow(10, intcount-1-i);
            a = a/10;
        }
        return check;
    }
    
    public static boolean emirp(int a) { //error in here
        boolean check = true;
        
        check=!palinPrime(a);
        
        if (a<13)
            check=false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0) {
                check = false;
                break;
            }
        }
        
        int reversea=0;
        int intcount= (int)(Math.log10(a)+1);
        for (int i = 0; i < intcount; i++) {
            reversea = reversea + (int)(a%10)*(int)Math.pow(10, intcount-1-i); 
            a=a/10;
        }
                
        for (int i = 2; i <= Math.sqrt(reversea); i++) {
            if (reversea%i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
    
}
