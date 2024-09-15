package Homework.lesson5;

// Task1
public class bankAccount {
    int id = 10;
    String name = "Test";
    double balance = 100;

    //method 1
    void topUpAccount(double sumaForTopUpAccount) {
        System.out.println("Hello " + name + ", sum of balance: " + balance);
        System.out.println("Method try to up balance for: " + sumaForTopUpAccount);
        balance += sumaForTopUpAccount;
        System.out.println("Balance is up to date, your balance now is: " + balance);
    }

    //method 2
    void withdraw(double deleteMoneyFromAccount) {
        System.out.println("account will be deleting for: " + deleteMoneyFromAccount);
        balance -= deleteMoneyFromAccount;
        System.out.println("money successfully deleted, your balance is: " + balance);
    }
}

class bankAccountTest{
    public static void main(String[] args) {

        bankAccount bA = new bankAccount();
        bA.topUpAccount(100);
        bA.withdraw(200);

    }
}
