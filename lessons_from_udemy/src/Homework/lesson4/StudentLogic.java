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

    student2.avgGradeOfMath = 08.00;
    student2.avgGradeOfEconom = 08.00;
    student2.avgGradeOfForeignlanguage = 08.00;

    student3.avgGradeOfMath = 12.00;
    student3.avgGradeOfEconom = 12.00;
    student3.avgGradeOfForeignlanguage = 12.00;

    double avgGradeStudent1 = student1.avgGrade();
    double avgGradeStudent2 = student2.avgGrade();
    double avgGradeStudent3 = student3.avgGrade();

    System.out.println("Student 1: " + avgGradeStudent1);
    System.out.println("Student 2: " + avgGradeStudent2);
    System.out.println("Student 3: " + avgGradeStudent3);

        // average grade for 3 lectures for student1
    //double avgResultOfGradesStudent1 = (student1.avgGradeOfMath + student1.avgGradeOfEconom + student1.avgGradeOfForeignlanguage) / 3;
        //System.out.println("avgResultOfGradesStudent1 " + avgResultOfGradesStudent1);
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

    double sumGrades(){
        return avgGradeOfMath + avgGradeOfEconom + avgGradeOfForeignlanguage;
    }
    double avgGrade(){
        double resultOfSumGrades = sumGrades();
        return resultOfSumGrades / 3;

    }
}
