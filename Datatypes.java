public class Datatypes {
    
    public static void main(String[] args) {
        boolean isRaining = true;
        System.out.println(isRaining); 

        char testChar = 'a';
        int testInt = 5;
        double testDouble = 0.123456789d;
        float testFLoat = 0.123f;
        long testLong = 123456789123456789L;

        System.out.println(testChar);
        System.out.println(testInt);
        System.out.println(testDouble);
        System.out.println(testFLoat);
        System.out.println(testLong);

        //type widening
        int x = 7;
        long y = x;
        float z = y;
        double a = z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

        //narrow type casting
        double temperature = 32.654;
        int tempShortened = (int)temperature;

        System.out.println(temperature);
        System.out.println(tempShortened);        
    }
}