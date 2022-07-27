package day31_CustomClass_Constructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {



        // 4 tester objects

        Testers tester1 = new Testers("Jack", "SDET", 111, 102000);
        Testers tester2 = new Testers("Jane", "QA", 112, 81000);
        Testers tester3 = new Testers("Jack", "SDET", 113, 102000);
        Testers tester4 = new Testers("Lala", "SE", 114, 72000);

        Testers [] testersList = {tester2,tester3, tester4};

        // 5 developer objects
        Developers dev1 = new Developers("Kimberly", "Software Developer", 211, 114000);
        Developers dev2 = new Developers("Burton  ", "Java Master", 212, 94000);
        Developers dev3 = new Developers("Joshua  ", "Team Leader", 213, 134000);
        Developers dev4 = new Developers("Patrick ", "Junior Java Developer", 214, 64000);
        Developers dev5 = new Developers("Olga    ", "Java Developer", 215, 122000);

        Developers [] developersList = {dev1,dev3,dev4, dev5};
        // 1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Niagara", "Dudely", "Naomi", 14);
        scrum.addTester(tester1);
        scrum.addTesters(testersList);

        scrum.removeTester(113);

        scrum.addDeveloper(dev2);
        scrum.addDevelopers(developersList);
        scrum.removeDeveloper(215);
        System.out.println(scrum);
        // scrum.addAll(Arrays.asList())

        System.out.println("----TESTERS-------");

        for ( Testers each : scrum.testersList) {
            System.out.println(each.name + " : $ " + each.salary);
        }

        System.out.println("----DEVELOPERS-------");

        for ( Developers eachDevs : scrum.devsList) {
            System.out.println(eachDevs.name + " : $ " + eachDevs.salary);
        }


    }
}
