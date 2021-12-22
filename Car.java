public class Car {
    String model;
    String colour;
    int speed;
    int wheels = 4;

    public Car(int y) {
        speed = y;
    }

    public static void main(String[] args) {
        Car toyota = new Car(1);
        System.out.println(toyota.speed);
         

    }    
    
}