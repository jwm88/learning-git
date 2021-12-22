import java.util.Scanner;
//this comment is for tracking changes with git purposes

public class StringCalculator {

    public class inputClass {
        //Handles all input
        static Scanner in = new Scanner(System.in);

        public static int checkIntegerType(String script) {
            //Checks that the input is an integer 
            //requests a new input until an integer is given
            //returns the integer
            String errorMessage = "Invalid input (NOT INT). Please try again.";
            while (!inputClass.in.hasNextInt()) {
                System.out.println(errorMessage);
                System.out.println(script);
                inputClass.in.next();
            }
            int inputToCheck = inputClass.in.nextInt();
            return inputToCheck;           
        }

        public static double checkDoubleType(String script) {
            //Checks that the input is a double 
            //requests a new input until a double is given
            //returns the double
            String errorMessage = "Invalid input (NOT DBL). Please try again.";
            while (!inputClass.in.hasNextDouble()) {
                System.out.println(errorMessage);
                System.out.println(script);
                inputClass.in.next();
            }
            double inputToCheck = inputClass.in.nextDouble();
            return inputToCheck;   
    }
}

    public static int chooseOperation() {
        //asks the user to choose a mathematical operation to perform
        //calls the checkIntegerType method to ensure an integer is entered
        String script = "Choose an operation: \n1) Addition\n2) Subtraction\n3) Multipliction\n4) Division\n";
        System.out.print(script);
        int OperatorChoice = inputClass.checkIntegerType(script); 
        return OperatorChoice;
    }

    public static boolean checkInput(int userInput) {
        //check the user input is a valid choice from the list of operators
        int[] validInputs = {1,2,3,4};
        String errorMessage = "Invalid input (NOT 1234). Please try again. ";
        boolean found = false;
        for (int input: validInputs) {
            if (input == userInput) {
                found = true;               
            }
        }
        if (! found) {
            System.out.println(errorMessage);
        }
        return found;
    }

    public static double[] askForNumbers() {
        //asks the user for two nummbers 
        //calls the checkDoubleType method to ensure an integer is entered
        String script ="Enter two numbers: ";
        String badSecondNumber = "Enter the second number: ";
        System.out.println(script);
        double[] numbers = {0,0};
        numbers[0] = inputClass.checkDoubleType(script);
        numbers[1] = inputClass.checkDoubleType(badSecondNumber);
        return numbers;
    }

    public static void calculate(int operator, double num1, double num2) {
        //performs a calculation based on the choice of operator and numbers
        switch (operator) {
            case 1:
            System.out.println("The sum is: " + (num1 + num2));
            break;

            case 2:
            System.out.println("The difference is: " + (num1 - num2));
            break;

            case 3:
            System.out.println("The product is: " + (num1 * num2));
            break;

            case 4:
            System.out.println("The quotient is: " + (num1 / num2));
            break;

            default:
            System.out.println("You broke it.");
            break;
        }
    }

    public static void runCalculator() {
        //run the calculator sequence
        int chosenOperator = chooseOperation();
        boolean validChoice = checkInput(chosenOperator);
        
        while (! validChoice) {
            chosenOperator = chooseOperation();
            validChoice = checkInput(chosenOperator);                     
        } 
        
        double[] operands = askForNumbers();
        double firstInput = operands[0];
        double secondInput = operands[1];

        calculate(chosenOperator, firstInput, secondInput );
    }
    
    public static void main(String[] args) {        
        runCalculator();     
    }    
}