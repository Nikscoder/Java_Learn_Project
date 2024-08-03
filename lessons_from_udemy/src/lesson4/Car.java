package lesson4;

public class Car {
    String color="red";
    String engine="v6";
}

class CarMainClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car2;

        System.out.println(car3.color);
    }
}