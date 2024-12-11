package viva2;

import java.util.Scanner;

public class G101 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter number of test cases: ");
        int testcase = sc.nextInt();
        System.out.flush();
        if (testcase < 1 || testcase > 10) {
            System.out.println("Invalid number of test case. Exiting....");
            System.exit(0);
        }
        for (int a = 0; a < testcase; a++) {
            
            System.out.print("Enter your name: ");
            if (a==0)
                sc.nextLine();  // Consume left over newline
            String name = sc.nextLine();
            name = name.trim();

            System.out.print("Enter start time(hh:mm:ss): "); 
            String start = sc.nextLine();                   //do a checking to see if it's inputted in the correct format
            if (!isValidTimeFormat(start)) {
                System.out.println("Invalid format. Please enter time in format hh:mm:ss. Exiting....");
                System.exit(0);
            }
            
            System.out.print("Enter end time(hh:mm:ss): ");
            String end = sc.nextLine();
            if (!isValidTimeFormat(end)) {
                System.out.println("Invalid format. Please enter time in format hh:mm:ss. Exiting....");
                System.exit(0);
            }


            System.out.println("");
            for (int i = 0; i < 60; i++) {
                System.out.print("+");
            }
            System.out.println("");

            if (isPrintingWelcomeMessage(name)) 
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");

            System.out.print(generateInitials(name));
            
            if (isPrintingWelcomeMessage(name) && !(name.equalsIgnoreCase("Ridwan Faiz bin Mohamad Hassan") || name.equalsIgnoreCase("Suresh a/l Subramaniam") || name.equalsIgnoreCase("Lee Kah Sing") )) {
                System.out.println("!!!!!!!!!!");
                if (generateInitials(name).equalsIgnoreCase("RFMH") || generateInitials(name).equalsIgnoreCase("SS") || generateInitials(name).equalsIgnoreCase("LKS")) {
                    System.out.print("WE KNOW IT'S YOU!");
                } else {
                    System.out.print("WE KNOW IT'S YOU -- ");
                    name = name.toUpperCase();
                    if (name.contains("RIDWAN") || name.contains("FAIZ") || name.contains("MOHAMAD") || name.contains("HASSAN")) {
                        System.out.print("MUHAMMAD RIDWAN BIN MOHAMAD HASSAN!");
                    } else if (name.contains("SURESH") || name.contains("SUBRAMANIAM")) {
                        System.out.print("SURESH A/L SUBRAMANIAM!");
                    } else {
                        System.out.print("LEE KAH SING!");
                    }
                }
            }

            int[] diff = calculateInterval(start, end);
            if (diff[0] < 6) {
                System.out.print("\nSLEEP NOW!!!!!!!!!!");
            }
            System.out.printf("\n%02d:%02d:%02d\n", diff[0], diff[1], diff[2]);

            for (int i = 0; i < 60; i++) {
                System.out.print("+");
            }
            System.out.println("");
        
        }
    }
    
    
    //Create a method named generateInitials to generate the initials of the user(s) of the computer program
    public static String generateInitials(String fullname) { 
        String initials = "";
        fullname = fullname.trim();
        fullname = fullname.toUpperCase();

        String regex = "\\b(BIN|BINTI|AL|A/L|AP|A/P)\\b";
        fullname = fullname.replaceAll(regex, "").replaceAll("\\s+", " ").trim();
    
        String regex1 = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/\\?`~\\s]";
        String[] name = fullname.split(regex1); // splits on all symbols
        
        for (String name1 : name) {
            if (!name1.isEmpty()) { 
                initials = initials + name1.charAt(0);
            }
        }
        return initials;
    }

    /*IMPORTANT NAMES
    Ridwan Faiz bin Mohamad Hassan
    Suresh a/l Subramaniam
    Lee Kah Sing*/
    public static boolean isPrintingWelcomeMessage(String fullname) {
        boolean isp = false;
        fullname = fullname.trim();
        fullname = fullname.toUpperCase();
        fullname = fullname.replace("A/L", "").replace("A/P", "").replace("AL", "").replace("AP", "").replace("BIN", "").replace("BINTI", "");
        String regex = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/\\?~]";
        fullname = fullname.replaceAll(regex, " ").replaceAll("\\s+", " ").trim();
        String[] name = fullname.split("\\s+");

        String[] rfmh = "Ridwan Faiz Mohamad Hassan".toUpperCase().split("\\s");
        String[] ss = "Suresh Subramaniam".toUpperCase().split("\\s");
        String[] lks = "Lee Kah Sing".toUpperCase().split("\\s");
        
        
        // Check if all parts of the name belong exclusively to one "dude"
        if (matchesAll(name, rfmh)) {
            isp = true;
        } else if (matchesAll(name, ss)) {
            isp = true;
        } else if (matchesAll(name, lks)) {
            isp = true;
        }

        return isp;
    }
    // Helper method to check if all parts of `name` exist in `array`
    private static boolean matchesAll(String[] name, String[] array) {
        for (String n : name) {
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (n.equals(array[i])) {
                    found = true;
                    array[i] = ""; // Mark as used to avoid reuse
                    break;
                }
            }
            if (!found) {
                return false; // If any part is not found, return false
            }
        }
        return true; // All parts matched
    }

    public static int[] calculateInterval(String time1, String time2) {
        int[] hhmmss1 = new int[3];
        int[] hhmmss2 = new int[3];
        int expon=0;
        
        time1 = time1.trim(); //remove any whitespace mistakenly added by the user
        time2 = time2.trim();
        
        int timelen1 = time1.length() - 1;  // -1 to make sure we can used text.charAt() directly and prevent out of bounds
        int timelen2 = time2.length() - 1;
              
        // get value of ss1
        while(timelen1>-1) {
            if (time1.charAt(timelen1) == ':') {  // check if we've hit a SPACE character so that we can move on to he next variable(aaa is next)
                timelen1--;                      // to remove the WHITESPACE
                expon=0;                        // to reset the exponent for the next variable (aaa is next)
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss1[2] += (time1.charAt(timelen1)-48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen1--;                          // to check the character next to it
        }
        // get value of mm1
        while(timelen1>-1) {
            if (time1.charAt(timelen1) == ':') {  // check if we've hit a SPACE character so that we can move on to he next variable(aaa is next)
                timelen1--;                      // to remove the WHITESPACE
                expon=0;                        // to reset the exponent for the next variable (aaa is next)
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss1[1] += (time1.charAt(timelen1)-48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen1--;                          // to check the character next to it
        }
        // get value of hh1
        while(timelen1>-1) {
            if (time1.charAt(timelen1) == ':') {  // check if we've hit a SPACE character so that we can move on to he next variable(aaa is next)
                timelen1--;                      // to remove the WHITESPACE
                expon=0;                        // to reset the exponent for the next variable (aaa is next)
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss1[0] += (time1.charAt(timelen1)-48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen1--;                          // to check the character next to it
        }
        
        expon=0;
        // get value of ss2
        while(timelen2 > -1) {
            if (time2.charAt(timelen2) == ':') {  // check if we've hit a SPACE character so that we can move on to the next variable
                timelen2--;                      // to remove the WHITESPACE
                expon = 0;                        // to reset the exponent for the next variable
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss2[2] += (time2.charAt(timelen2) - 48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen2--;                          // to check the character next to it
        }
        // get value of mm2
        while(timelen2 > -1) {
            if (time2.charAt(timelen2) == ':') {  // check if we've hit a SPACE character so that we can move on to the next variable
                timelen2--;                      // to remove the WHITESPACE
                expon = 0;                        // to reset the exponent for the next variable
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss2[1] += (time2.charAt(timelen2) - 48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen2--;                          // to check the character next to it
        }
        // get value of hh2
        while(timelen2 > -1) {
            if (time2.charAt(timelen2) == ':') {  // check if we've hit a SPACE character so that we can move on to the next variable
                timelen2--;                      // to remove the WHITESPACE
                expon = 0;                        // to reset the exponent for the next variable
                break;
            }
            // -48 because char 0-9 in ASCII is 48-57. We minus by 48 to offset it to its real value
            hhmmss2[0] += (time2.charAt(timelen2) - 48) * Math.pow(10, expon);
            expon++;                            // to increase the exponent for the next iteration
            timelen2--;                          // to check the character next to it
        }
    
        return subtractTimeComp(hhmmss1, hhmmss2);
    }
    // Helper method to subtract
    public static int[] subtractTimeComp(int[] arr1, int[] arr2) {
        int[] result = new int[3];

        // Subtract seconds
        if (arr2[2] < arr1[2]) {
            arr2[1]--; // Borrow 1 minute
            arr2[2] += 60;
        }
        result[2] = arr2[2] - arr1[2];

        // Subtract minutes
        if (arr2[1] < arr1[1]) {
            arr2[0]--; // Borrow 1 hour
            arr2[1] += 60;
        }
        result[1] = arr2[1] - arr1[1];

        // Subtract hours
        result[0] = arr2[0] - arr1[0];

        // check if hour's negative
        if (result[0] < 0) {
            result[0] += 24;
        }        
        
        return result;
    }
    //check if itme is entered in hh:mm:ss
    public static boolean isValidTimeFormat(String time) {
        // Regular expression to match HH:MM:SS format
        String regex = "^\\d{2}:\\d{2}:\\d{2}$";

        // Check if input matches the format
        if (!time.matches(regex)) {
            return false;
        }

        // Further check for valid ranges
        String[] parts = time.split(":");
        
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        
        // get value of ss
        int expon=0;
        for (int i = 1; i > -1; i--) {
            seconds += (parts[2].charAt(i)-48) * Math.pow(10, expon);
            expon++;
        }
        // get value of ss
        expon=0;
        for (int i = 1; i > -1; i--) {
            minutes += (parts[1].charAt(i)-48) * Math.pow(10, expon);
            expon++;
        }
        // get value of ss
        expon=0;
        for (int i = 1; i > -1; i--) {
            hours += (parts[0].charAt(i)-48) * Math.pow(10, expon);
            expon++;
        }
        
        return (hours >= 0 && hours < 24) && 
               (minutes >= 0 && minutes < 60) && 
               (seconds >= 0 && seconds < 60);
    }

}

/* alg for keeping a/l and a/p
        fullname = fullname.trim();
        fullname = fullname.toUpperCase();
        
        fullname = fullname.replace("A/L", "tempal").replace("A/P", "tempap");
        
        String regex = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/\\?~]";
        fullname = fullname.replaceAll(regex, "").replaceAll("\\s+", " ").trim();

        fullname = fullname.replace("tempal", "A/L").replace("tempap", "A/P");
        
        System.out.println(fullname);
        
        String regex1 = "\\s+";
        String[] name = fullname.split(regex1); // all name have been split on whitespace
        
        //do the checking to see if their name has parts of the 3 dudes name
        String[] rfmh = "Ridwan Faiz bin Mohamad Hassan".toUpperCase().split("\\s");
        String[] ss = "Suresh a/l Subramaniam".toUpperCase().split("\\s");
        String[] lks = "Lee Kah Sing".toUpperCase().split("\\s");
*/