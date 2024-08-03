package Lesson5;

class Math{

    int SumThreeIntegers(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int Minus(int a, int b){
        int result = a - b;
        return result;
    }

    double Division (double a, double b){
        double result = a/b;
        return result;
    }

    // method with calling another method
    int avgOfThreeNumbers(int a1, int b1, int c1){
        int result = SumThreeIntegers(a1,b1,c1)/3;
        return result;
    }
}

// main class
public class Lesson5 {
    // main method
    public static void main(String[] args) {

        Math obj = new Math();

        int sumResult = obj.SumThreeIntegers(1,2,3);
        int minusResult = obj.Minus(5,4);
        double divisionResult = obj.Division(10.0,8.0);
        int avgResult = obj.avgOfThreeNumbers(2,2,2);

        System.out.println(sumResult);
        System.out.println(minusResult);
        System.out.println(divisionResult);
        System.out.println(avgResult);
    }
}


