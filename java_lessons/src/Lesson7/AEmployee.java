package Lesson7;

public class AEmployee {
     double salary;

    //method to update salary x2
    protected void updateSalary() {
        //local variable which visible only in the method and doesn't have the access modifier because it is local
        double result = salary*2;
        System.out.println("Your salary x2: " + result);
    }

    //constructor
    protected AEmployee(double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        AEmployee emp = new AEmployee(1000.0);
        System.out.println(emp.salary);
        emp.updateSalary();
    }
}


