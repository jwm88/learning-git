import java.util.Scanner;

public class CheckInputType {

    public class inputClass {
        //Handles all input
        static Scanner in = new Scanner(System.in);

        public static int checkInputType(String script) {
            //Checks that the input is an integer
            String errorMessage = "Invalid input";
            while (!inputClass.in.hasNextInt()) {
                System.out.println(errorMessage);
                System.out.println(script);
                inputClass.in.next();
            }
            int OperatorChoice = inputClass.in.nextInt();
            return OperatorChoice;           
        }
    }

    // public static int chooseOperation () {
    //     //Ask the user to choose a mathematical operation to perform
    //     String script = "Choose an operation: \n1) Addition\n2) Subtraction\n3) Multipliction\n4) Division ";
    //     System.out.println(script);
    //     int OperatorChoice = inputClass.in.nextInt();        
    //     return OperatorChoice;        
    // }

    public static int chooseOperation() {
        String script = "Choose an operation: \n1) Addition\n2) Subtraction\n3) Multipliction\n4) Division \n";
        System.out.print(script);
        int OperatorChoice = inputClass.checkInputType(script);        
        // while (!inputClass.in.hasNextInt()) {
        //     System.out.println(errorMessage);
        //     System.out.println(script);
        //     inputClass.in.next();
        // }
        // int OperatorChoice = inputClass.in.nextInt();
        return OperatorChoice;
    }



    public static void main(String[] args) {
        //chooseOperation ();
        chooseOperation();
    }



}
