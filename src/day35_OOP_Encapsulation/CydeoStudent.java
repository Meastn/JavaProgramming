package day35_OOP_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public String continent;

    public static String schoolName, fieldOfStudy,programmingLanguage, secretCode ;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String continent) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.continent = continent;
    }

    static {
        schoolName = "Cydeo School";
        fieldOfStudy = "SDET";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName () {
        System.out.println("Schoolname is " + schoolName);
    }

    public static void printProgrammingLanguage (){
        System.out.println("Programming Language is " + programmingLanguage);
    }

    public static void printSecretCode() {
        System.out.println("Secret Code is " + secretCode);
    }

    public void attendClass (){
        System.out.println(name + " attends " + continent + " classes in batch " + batchNumber);
    }

    public void study (){
        System.out.println(name + " studies" + programmingLanguage + " in batch " + batchNumber + " and in group" + groupNumber);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", continent=" + continent +
                ", school name=" + schoolName +
                ", field of study=" + fieldOfStudy +
                ", Programmming Language =" + programmingLanguage +
                '}';
    }
}


/*
create a class named CydeoStudent

Variables:
name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage

Add a constructor to initialize all the fields
Add a static block to initialize all the statics

Methods:
attendClass ()
study()
toString ()

 */