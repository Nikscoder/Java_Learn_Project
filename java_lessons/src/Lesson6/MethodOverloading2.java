package Lesson6;

//Types of everloading with different return types
public class MethodOverloading2 {
    int sum (int i1, int i2){
        return i1+i2;
    }

    String sum(String s1, String s2){
        return s1+s2;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int sum = mO2.sum(2,2);
        String sumS = mO2.sum("X","S");
        System.out.println(sum);
        System.out.println(sumS);
    }
}
