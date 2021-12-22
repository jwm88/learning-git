public class Arrays {

    public static void main(String[] args) {
        //create an array
        int fruits[] = {1,1,1,1,1};

        //do it with a loop
        System.out.println("Using a for loop:");
        int total = 0;
        for (int i: fruits) {
            total = total + i;
        }
        System.out.println(total);
    }    
}