package Test;

public class Test {
    public static String XYZ="XYZ";
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("");
        person1.setAge(20);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        person1.mPrint();

        // int yearToRetirtmentForPerson1 = person1.calculateYearToRetirtment();
        // int yearToRetirtmentForPerson2 = person2.calculateYearToRetirtment();
        person1.printYearCalculation();
        person2.printYearCalculation();

    }
}

class Person {
    private String name;
    private int age;

    //setter
    public void setName(String username) {
        if (username.isEmpty()){
            System.out.println("Your name in empty");
        } else {
            name = username;
        }
    }
    //getter
    public String getName (){
        return name;
    }

    //setter
    public void setAge(int userAge){
        age=userAge;
    }
    //getter
    public int getAge(){
        return age;
    }


    public int calculateYearToRetirtment(){
        int yearToRetritment = 65;
        return yearToRetritment-age;
    }

    public void printYearCalculation() {
        System.out.println("Year to retritment: " + calculateYearToRetirtment());
    }

    public void mPrint(){

        System.out.println("Person1 name: " + name + ", and age: " + age);

    }
}