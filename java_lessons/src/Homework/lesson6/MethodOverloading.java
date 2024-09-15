package Homework.lesson6;

public class MethodOverloading {

    int sum (){
        int result = 0;
        System.out.println("Sum is: " + result);
        return result;
    }
    int sum (int a){
        int result = a;
       // System.out.println("Sum is: " + result);
        return result;
    }
    int sum (int a, int b){
        int result = a + b;
        //System.out.println("Sum is: " + result);
        return result;
    }
    int sum (int a, int b, int c){
        int result = sum(a, b) + c;
       // System.out.println("Sum is: " + result);
        return result;
    }
    int sum (int a, int b, int c, int e){
        int result = sum(a, b, c) + e;
       // System.out.println("Sum is: " + result);
        return result;
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.sum(5,5,5,5));
        System.out.println(obj.sum());
    }
}
