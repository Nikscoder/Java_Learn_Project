/**
 *  Below code related with using default and user-defined constructors without 'this'
 */

package Lesson5;

public class Human {
    public static void main(String[] args) {
        System.out.println("Main class!");

        // creating an obj
        HumanTest obj = new HumanTest();
        obj.name="David";

        // with String parameters constructor
        obj.car1 = new Car("white", "V6");

        // with int and double parameters constructor
        obj.balance = new BankAccount(1, 12.50);

        // method info from HumanTest class
        obj.info();
    }
}

class HumanTest{
    // instance fields with reference data types
    String name; // with reference to default String class
    Car car1; // with reference to class Car
    BankAccount balance; // with reference to class BankAccount

    // method void of HumanTest class
    void info() {
        System.out.println("Name of user: " + name + ", car color: " + car1.color + ", also your balance in a bank is: " + balance.balance);
    }
}

class Car {
    // instance fields
    String color;
    String engine;

    //constructor with String parameters
    Car(String color1, String engine1){
        color=color1;
        engine=engine1;
    }
}

class BankAccount{
    //instance fields
    int id;
    double balance;

    // user-defined constructor with two parameters
    BankAccount(int id1, double balance2){
        id=id1;
        balance=balance2;
    }
}
