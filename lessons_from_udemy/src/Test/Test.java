package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i =1;i<=10;i++){
            int result = a*i;
            System.out.println(a + "x" + i + "=" + result);
        }
    }
}




 //   System.out.println("================================");
   // System.out.printf("%-15s%03d%n", inputString1[0],Integer.parseInt(inputString1[1]));
     //   System.out.printf("%-15s%03d%n", inputString2[0],Integer.parseInt(inputString2[1]));
       // System.out.printf("%-15s%03d%n", inputString3[0],Integer.parseInt(inputString3[1]));
        //System.out.println("================================");