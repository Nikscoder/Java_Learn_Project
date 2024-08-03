package PractiseTask;

import java.util.Scanner;

public class IntToStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_user = sc.nextInt();
        Logic l = new Logic();
        if (input_user > -100 && input_user < 100 && l.result(input_user) instanceof String){
            System.out.println("Good job");
        } else {
            System.out.println("error");
        }
    }
}

class Logic {
    String result(int input_user){
        return Integer.toString(input_user);
    }
}