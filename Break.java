public class Break{
public static void main(String[] args) {
    
    System.out.println("Before the loop");
    for (int i=1; i <= 5; i++) {
        
        if (i == 3) {
            continue;
        }
        System.out.println(i);
        }
        System.out.println("We are all out of loops ");
    }   
}