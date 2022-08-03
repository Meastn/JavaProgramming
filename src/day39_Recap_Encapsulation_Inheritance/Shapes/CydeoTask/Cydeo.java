package day39_Recap_Encapsulation_Inheritance.Shapes.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester t1 = new Tester("Aisha", 34, 'F', 100121, "Lead QA",123000 );
        Developer d1 = new Developer("Alison", 26, 'F', 100122, "Java Developer", 144000);
        Teacher teach1 = new Teacher("Alan", 29, 'M', 100123, "Lecturer", 127000);
        Student student1= new Student("Robert", 21, 'M', 200121, "Java Programming");

        System.out.println(student1);
        System.out.println(t1);
        t1.work();
        teach1.work();

        teach1.setAge(74);
        teach1.setSalary(124000);
        System.out.println(teach1);

        d1.eat();
        d1.sleep();
        d1.work();
        System.out.println("------");
        t1.sleep();
        t1.createTicket();
        t1.work();
    }

}
