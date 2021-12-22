import java.util.Scanner;

public class Gnirts {
 

    static String reverseString (String toBeReversed) {
        //Takes a string as input and returns the reverse of that string
        
        int stringLength = toBeReversed.length();
        String reversedString = ""; //placeholder variable for reversed string

        for (int i = (stringLength-1) ; i>=0;i--) {
            char toBeAppended = toBeReversed.charAt(i);
            reversedString = reversedString + toBeAppended;                   
        }

        return reversedString;        
    }

    static void askForString () {

        Scanner input = new Scanner (System.in);
        System.out.println("What would you like to reverse?"); 
        String reverseMe = input.nextLine();
        String iAmReversed = reverseString(reverseMe);
        System.out.println(iAmReversed);
        input.close();

    }

    public static void main(String[] args) {
        //Runs from cmd line if a string is passed
        if (args.length == 0)
        {        
        askForString();
        }
        else {
            System.out.println(reverseString(args[0]));
        }        
    }
    
}