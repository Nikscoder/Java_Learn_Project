package Homework.lesson5;

public class Student {
    int student_id;
    String name;
    String surname;
    int year_of_education;
    double avgGradeOfMath;
    double avgGradeOfEconom;
    double avgGradeOfForeignlanguage;
}
//TODO: try to use class parameters in methods

class StudentTest{
    //mmethod with class Student parameter
    double avgGrade(Student st){
        System.out.println("We are in avgGrade method, hello: " + st.name);
        double resultOfAvgGrade = (st.avgGradeOfMath+ st.avgGradeOfEconom+ st.avgGradeOfForeignlanguage) /3;
        System.out.println("Your average Grade is: " + resultOfAvgGrade);
        return resultOfAvgGrade;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name="Student1";
        st1.avgGradeOfEconom = 10;
        st1.avgGradeOfMath = 10;
        st1.avgGradeOfForeignlanguage = 10;

        Student st2 = new Student();
        st2.name="Student2";
        st2.avgGradeOfEconom = 8;
        st2.avgGradeOfMath = 8;
        st2.avgGradeOfForeignlanguage = 8;

        StudentTest stTest = new StudentTest();
        stTest.avgGrade(st1);
        stTest.avgGrade(st2);




    }
}
