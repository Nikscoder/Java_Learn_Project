package Lesson7;

public class visibilityOfEmployeeClass {
    public static void main(String[] args) {
        AEmployee emp = new AEmployee(10);
        System.out.println(emp.salary);
        emp.updateSalary();
    }
}
