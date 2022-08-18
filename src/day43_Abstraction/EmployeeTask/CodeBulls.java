package day43_Abstraction.EmployeeTask;

public class CodeBulls {
    public static void main(String[] args) {

        Tester t1 = new Tester("James", 44,'M',102121,"QA",120000 );
        Developer d1 = new Developer("Ailene", 34, 'F', 102122, "Java Developer", 140000);
        Teacher te1= new Teacher("Josh", 27, 'M', 102124, "Teacher", 100000);


        System.out.println(t1);
        System.out.println(d1);
        System.out.println(te1);
        System.out.println("-----");
        t1.eatBreakfast();
        d1.eatBreakfast();
        te1.eatBreakfast();
        System.out.println("-----");
        t1.work();
        t1.bugreport();
        t1.sleep();

    }
}
