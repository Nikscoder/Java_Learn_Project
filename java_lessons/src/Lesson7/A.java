package Lesson7;

import Lesson6.Employee;

public class A {
    public static void main(String[] args) {
        B obj = new B(4);
        Lesson6.Employee emp = new Lesson6.Employee("Ivanov", 34);
        System.out.println(emp.surname);
    }
}
