package Homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int user_id, String user_surname, int user_age, double user_salary, String user_department){
        id=user_id;
        surname=user_surname;
        age=user_age;
        salary=user_salary;
        department=user_department;
    }

    double increaseUserSalary(){
        salary *=2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {

        System.out.println("Task3");
        Employee obj1 = new Employee(1,"Learner", 40,100, "XYZ" );
        obj1.increaseUserSalary();
        System.out.println("Hello " + obj1.surname + ", your salary increased: " + obj1.salary);

    }
}
