package viva1;

import java.util.Scanner;

public class Viva1Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        int n=0, a=0, b=0, textlen, expon=0;
        
        
        System.out.print("Enter 3 numbers in this format[nnn aaa bbb]: ");
        text = sc.nextLine();
        text = text.trim(); //remove any whitespace mistakenly added by the user
        textlen = text.length() - 1;  // -1 to make sure we can used text.charAt() directly and prevent out of bounds
        
        // get value of b
        while(textlen>-1) {
            if (text.charAt(textlen) == ' ') {  // check if we've hit a SPACE character so that we can move on to he next variable(aaa is next)
                textlen--;                      // to remove the WHITESPACE
                expon=0;                        // to reset the exponent for the next variable (aaa is next)
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            b += (text.charAt(textlen)-48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            textlen--;                          // to check the character next to it
        }        
        
        // get value of a
        while(textlen>-1) {
            if (text.charAt(textlen) == ' ') {
                textlen--;
                expon=0;
                break;
            }
            a += (text.charAt(textlen)-48) * Math.pow(10, expon);
            expon++;
            textlen--;
        }

        // get value of n
        while(textlen>-1) {
            n += (text.charAt(textlen)-48) * Math.pow(10, expon);
            expon++;
            textlen--;
        }
        
        
        textlen=0;  // reusing an old unused variable
        while(n>1) {
            
            if (n%b == 0) {
                n = n / b;      // try division first
            } else {
                n = n - a;      // perform addition when division fails
            }
            textlen++; // to count the number of steps
            
        }
        
        if (n == 1) {
            System.out.println(textlen); //for when it's possible
        } else {
            System.out.println("-1"); //for when it's impossible
        }
        
        
    }
}
    
