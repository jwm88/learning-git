import java.util.Scanner;

public class Difference {

    public static int getNumber() {
        
        System.out.println("Enter a number: ");
        int x = inputClass.in.nextInt();
        
        return x;
    }

    public static int subtract(int i, int j) {
        return(i-j);
    }

    public static void main(String[] args) {
        int i = getNumber();
        int j = getNumber();
        System.out.println(i + " minus " + j + " is " + subtract(i,j));
                     
    }  
}

class inputClass {
    static Scanner in = new Scanner(System.in);
}