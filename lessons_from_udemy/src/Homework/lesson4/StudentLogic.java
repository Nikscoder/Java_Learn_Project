package Homework.lesson4;

public class StudentLogic {
    public static void main(String[] args) {
    // creating 3 objects
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    //student 1, creating instance variables
    student1.student_id=1;
    student1.name="Niki";
    student1.surename="F";
    student1.year_of_education=2018;
    student1.avgGradeOfMath = 04.00;
    student1.avgGradeOfEconom = 04.00;
    student1.avgGradeOfForeignlanguage = 04.00;

    // average grade for 3 lectures for student1
    double avgResultOfGradesStudent1 = (student1.avgGradeOfMath + student1.avgGradeOfEconom + student1.avgGradeOfForeignlanguage) / 3;
        System.out.println("avgResultOfGradesStudent1 " + avgResultOfGradesStudent1);
    }
}

class Student{
    int student_id;
    String name;
    String surename;
    int year_of_education;
    double avgGradeOfMath;
    double avgGradeOfEconom;
    double avgGradeOfForeignlanguage;
}
