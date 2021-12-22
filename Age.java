public class Age {

    public static void main(String[] args) {
        
        int age = 5;

        do {
            System.out.println("You are not old enough!");
            age += 1;
        } 
        while (age >18);

        System.out.println("You are good to go");

    }  
        
}