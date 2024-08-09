package Homework.lesson5;

public class Student {
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

class StudentTest{
    public static void main(String[] args) {

    }
}
