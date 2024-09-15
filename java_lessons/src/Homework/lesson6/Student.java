package Homework.lesson6;

public class Student {
    int student_id;
    String name;
    String surname;
    int year_of_education;

    //constructor with full list of parameters
    Student(int id1, String name1, String surname1, int year_of_education1){
        student_id=id1;
        name=name1;
        surname=surname1;
        year_of_education=year_of_education1;
    }

    // constructor with two parameters wit overloading by this
    Student(String name2, String surname2){
        this(0,name2,surname2,0);
    }

    // constructor without parameters
    Student(){

    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student(1, "St", "Student1", 2);
        Student st2 = new Student("St2", "Student2");
        Student st3 = new Student();
        System.out.println(st1.surname);
    }
}
