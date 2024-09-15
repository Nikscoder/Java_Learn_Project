package Homework.lesson7;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ");
        Employee emp2 = new Employee(10);
        //constructor with salary parameter isn't accesssible from other class/packages because it is private constructor
        //Employee emp3 = new Employee(122.23);

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
