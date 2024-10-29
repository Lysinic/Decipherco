package tutorial2;
import java.util.Scanner;

/**
 *
 * @author alief
 */
public class Tutorial2 {

    public static void main(String[] args) {
        /*1. Display the sentence Faculty of Computer Science and Information Technology.
            a. In one line using multiple Java statements*/
        System.out.print("Faculty of Computer Science ");
        System.out.println("and Information Technology");
          //b. In multiple lines using one Java statement*/
        System.out.println("Faculty of Computer Science\nand Information Technology");

        //2. Write a Java statement that print "SDN" - Software-defined networking
        System.out.println("\"SDN\" - Software-defined networking");
        
        //3. Correct the error for the following statements.
        //a. System.Println("Java Programming"); # forgot .out, P should be lower case
        System.out.println("Java Programming");
        //b. System.in.println("Introduction to Java!") # should be .out not .in, forgot ;
        System.out.println("Introduction to Java!");
        //c. System.out.println("\t is the horizontal tab character"); # to display \, you need to use \\.
        System.out.println("\\t is the horizontal tab character");
        //d. system.out.println("Java is case sensitive!" ); # S should be capitalized
        System.out.println("Java is case sensitive!" );
        
        //4. Write statements for each of the following
        //a. Declare a variable that used to store the value of a matric number.
        String mat = "23001923";
        //b. Declare a variable that used to store the value of π.
        double pi = 3.14159;
        //c. Initialize a variable named M with the value set to false.
        boolean M = false;
        //d. Initialize a variable named P with the value set to 8800000000.
        String P = "8800000000";
        //e. Initialize a variable named letter with the value set to U.
        char letter = 'U';
        //f. Declare a constant variable named PRO. The value of the constant variable is Java
        final String PRO = "Java";
        
        //5. Correct the error for the following statements.
        //a.
        //final double AMOUNT = "32.5"; # remove final, remove ""
        //AMOUNT += 10;
        //System.out.println("The amount is " + AMOUNT);
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        
        //b.
        //string chapter = 'Summary'; # s should be capitalized, change '' with ""
        //System.out.println(chapter);
        String chapter = "Summary";
        System.out.println(chapter);
        
        //c.
        //int num; # value of num is not initialized
        //++num++; # ++ only before or after, not both
        //num1 = num; # num1 is not declared
        int num=0, num1;
        num++;
        num1 = num;
        
        //d.
        //int number = 3000; # should be float or double
        //System.out.printf("%4.2f\n", number);
        double number = 3000;
        System.out.printf("%4.2f\n", number);  
        
        //e.
        //String contact; # Note: must import java.util.Scanner;
        //Scanner keyboard = new Scanner(System.out); # should be System.in
        //contact = keyboard.nextLine();
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();
        
        //6. Write a java program that print the circumference of a circle. The input of the
        //program is diameter. Display the result in three decimal places. (Note PI = Math.PI)
        Scanner sc = new Scanner(System.in);
        double PI = Math.PI, diam, circ;
        System.out.print("Enter diameter: ");
        diam = sc.nextDouble();
        circ = PI*diam;
        System.out.printf("The circumference of the circle is : %.3f\n", circ);
        
        //7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54
        //centimeters). Print the output in two decimal places.
        double inch, metre;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        inch = input.nextDouble();
        metre = (2.54 * inch)/100;
        System.out.printf("%f inches = %.2f metres\n", inch, metre);

    }
}
