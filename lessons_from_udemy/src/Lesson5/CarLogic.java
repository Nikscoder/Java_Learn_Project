package Lesson5;


//public class can be only one in one file
public class CarLogic {
    String color = "black";
    String engine = "V6";
    int maxSpeed = 200;

    //method 1
    int addMoreSpeed(int equalSpeed){
        maxSpeed += equalSpeed;
        return maxSpeed;
    }

    //method 2
    int deleteSpeed(int equalSpeed){
        maxSpeed -= equalSpeed;
        return maxSpeed;
    }

    //method 3
    void showInfoAboutCar(){
        System.out.println(maxSpeed);

    }
}

class Car2Main {
    public static void main(String[] args) {
        CarLogic bmw = new CarLogic();
        // now the variable(object) bmw has an access to all method of CarLogic class
        bmw.showInfoAboutCar();
        bmw.addMoreSpeed(12);
        bmw.showInfoAboutCar();
        bmw.deleteSpeed(12);
        bmw.showInfoAboutCar();

    }
}
