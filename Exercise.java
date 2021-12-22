import java.util.Scanner;

public class Exercise{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name and age:");
        String name = input.nextLine();
        int age = input.nextInt();
        input.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
    }
    
}