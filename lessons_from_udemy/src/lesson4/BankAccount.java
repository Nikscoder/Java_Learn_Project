package lesson4;

import java.util.Objects;
import java.util.Scanner;

class BankAccountInstanceVariables {
    int id;
    String name;
    double balance;
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your name: ");
        String user_input = sc.nextLine();

        BankAccountInstanceVariables MyAccount = new BankAccountInstanceVariables();
        BankAccountInstanceVariables YourAccount = new BankAccountInstanceVariables();
        BankAccountInstanceVariables HisAccount = new BankAccountInstanceVariables();

        MyAccount.id=1;
        MyAccount.name="Name1";
        MyAccount.balance=20.03;

        YourAccount.id=2;
        YourAccount.name="Name2";
        YourAccount.balance=50.20;

        HisAccount.id=3;
        HisAccount.name="Name3";
        HisAccount.balance=11.76;

        if (Objects.equals(user_input, MyAccount.name)){
            System.out.println("ID of user is: " + MyAccount.id + ", Hello user " + MyAccount.name + ", " +
                    "your balance in a bank account is: " + MyAccount.balance + "$");
        } else if (Objects.equals(user_input, YourAccount.name)) {
            System.out.println("ID of user is: " + YourAccount.id + ", Hello user " + YourAccount.name + ", " +
                    "your balance in a bank account is: " + YourAccount.balance + "$");
        } else if (Objects.equals(user_input, HisAccount.name)) {
            System.out.println("ID of user is: " + HisAccount.id + ", Hello user " + HisAccount.name + ", " +
                    "your balance in a bank account is: " + HisAccount.balance + "$");

        }else {
            System.out.println("This customer is not defined!");
        }
    }


}
