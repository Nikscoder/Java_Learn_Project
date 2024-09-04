package Homework.lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void getSalary(){
        System.out.println("Salary " + salary);
    }
    public void getSurname(){
        System.out.println(surname);
    }
    public void getId() {
        System.out.println(id);
    }

    public Employee(String surname1){
        surname=surname1;
    }
    Employee(int id1){
        id=id1;
    }
    private Employee(double salary1){
        salary=salary1;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Zinchenko");
        Employee emp2 = new Employee(10);
        //constructor with salary parameter isn't accesssible from other class/packages because it is private constructor
        //Employee emp3 = new Employee(2400.20);

        System.out.println(emp1.surname);
        System.out.println(emp1.id);
        //salary variable is not accessible from other class because it's private
        //System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        System.out.println(emp2.surname);
        System.out.println(emp2.id);
        //salary variable is not accessible from other class because it's private
        //System.out.println(emp2.salary);

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();

    }
}