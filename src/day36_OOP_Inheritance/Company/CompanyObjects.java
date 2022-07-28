package day36_OOP_Inheritance.Company;

public class CompanyObjects {

    public static void main(String[] args) {

        Developer dv1= new Developer ();
        dv1.setInfo("Abmita", "Java Programmer", 34, 102000,101111, 'F');

        Tester tst1 = new Tester();
        tst1.setInfo("Humilia", "Junior Programmer", 24, 80000,101112, 'M');

        ScrumMaster sm1 = new ScrumMaster();
        sm1.setInfo("Scrummy", "Scrum Master", 41, 95000, 101113, 'M');

        System.out.println(dv1);
        System.out.println(tst1);
        System.out.println(sm1);
    }
}
