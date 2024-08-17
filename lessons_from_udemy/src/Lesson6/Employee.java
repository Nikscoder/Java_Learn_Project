package Lesson6;

public class Employee {

    //instant variables
    int id;
    String surname;
    int age;
    double salary;
    String department;

    // workers
    Employee(int id1, String surname1, int age1){
        this(id1, surname1, age1, 0.0, null);
    }

    //constructor for candidates to work wih only surname and age
    Employee(String surname2, int age2){
        this(0, surname2, age2, 0.0, null);
    }

    // constructor for stable employees
    Employee(int id3, String surname3, int age3, double salary3, String department3){
        id=id3;
        surname=surname3;
        age=age3;
        salary=salary3;
        department=department3;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Test0", 32);
        Employee emp2 = new Employee("Test1", 20);
        Employee emp3 = new Employee(3,"Test3", 30, 2100,"IT");
        Employee emp4 = new Employee(5, "XXX", 40);
        System.out.println(emp4.id);
        System.out.println(emp4.surname);
        System.out.println(emp4.age);
        System.out.println();
        System.out.println(emp3.department);

    }
}
