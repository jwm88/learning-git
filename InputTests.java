import java.util.Scanner;

public class InputTests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What are you yelling about?");
        String myInput = input.nextLine(); //reads text from the user
        System.out.println(myInput.toUpperCase());

        input.close();
        
    }
}