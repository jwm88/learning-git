import java.util.Scanner;

public class DingDong{   


    static String CheckDingDong (int inputNumber) {

        if (inputNumber % 15 == 0) {
            return "DingDong";
        } else if (inputNumber % 5 == 0) {
            return "Dong";
        } else if (inputNumber % 3 == 0) {
            return "Ding";
        } else {
            return String.valueOf(inputNumber);
        }
    }

public static void main(String[] args) {
    
    try {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a number: ");  
    int dingDongInput = input.nextInt();
    String dingDongNeither = CheckDingDong(dingDongInput);
    System.out.println(dingDongNeither);
    input.close();
        
    } catch (Exception e) {
        System.out.println("Stop! Only integers are accepted.");
    }       

}

}