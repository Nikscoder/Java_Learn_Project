package Lesson6;

public class MethodOverloading {
    void show(boolean b1){
        System.out.println("method with boolean parameter: " + b1);
    }

    void show(int i1){
        System.out.println("method with int parameter: " + i1);
    }

    void show(double d1){
        System.out.println("method with int and double: " +d1);
    }

    // below two method with same variables but with another order
    void show (String s, int i1){
        System.out.println("First string: " + s + ", next int: " + i1);
    }

    void show(int i1, String s) {
        System.out.println("First int: " + i1 + ", next is String: " + s);
    }
}


class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show("String", 10);
        mO.show(10, "Strings");
        int testInt = 10;
        mO.show(testInt);
    }
}