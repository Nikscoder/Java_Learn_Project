package Lesson6;

public class Employee {

    // workers
    Employee(int id1, String surname1, int age1){
        id=id1;
        surname=surname1;
        age=age1;
    }

    //constructor for candidates to work wih only surname and age
    Employee(String surname2, int age2){
        surname=surname2;
        age=age2;
    }

    // constructor for stable employees
    Employee(int id3, String surname3, int age3, double salary3, String department3){
        id=id3;
        surname=surname3;
        age=age3;
        salary=salary3;
        department=department3;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Test0", 32);
        Employee emp2 = new Employee("Test1", 20);
        Employee emp3 = new Employee(3,"Test3", 30, 2100,"IT");
        System.out.println(emp3.department);

    }
}
