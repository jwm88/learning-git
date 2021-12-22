public class Fruit {

    public static void main(String[] args) {
        
        String fruit = "Apple";

        switch (fruit) {

            case "Orange":
            System.out.println("Oranges are $0.59 a pound");
            break;

            case "Papaya":
            System.out.println("Papayas are $2.79 a pound");
            break;

            case "Mango":
            System.out.println("Mangoes are $2.50 a pound");
            break;

            default:
            System.out.println("Sorry, we are out of " + fruit);
        }
    }
    
}