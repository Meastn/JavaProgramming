package day37_Inheritance.ScrumTask;

public class CodeBulls {

    public static void main(String[] args) {

        String company = "CodeBulls";

        ProductOwner po = new ProductOwner("Joahim", 41, 'M', 10014, 125000,company);
        ScrumMaster sm = new ScrumMaster("Wonda", 32, 'F', 10015, 114000,company);
        BusinessAnalyst ba = new BusinessAnalyst("Rihanna", 28, 'F', 10016, 178000, company);

        Tester  tst1= new Tester("Caroline", 27, 'F', "QA", 10013, 90000, company);
        Tester  tst2= new Tester("Aaron", 37, 'M', "SDET", 10017, 112000, company);
        Tester  tst3= new Tester("Brad", 22, 'M', "SDET", 10018, 92000, company);
        Tester  tst4= new Tester("Irene", 24, 'F', "Cyber Security Tester", 10019, 99000, company);
        Tester [] testers = {tst1,tst2,tst3,tst4};

        Developer dv1 = new Developer("Bob", 34, 'M',"Mobile Developer", 10011, 100000,company);
        Developer dv2 = new Developer("James", 36, 'M',"Java Developer", 10012, 11000,company);

        Developer [] developers = {dv1, dv2};
        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);
        System.out.println("scrumTeam = " + scrumTeam);

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary + " : " + developer.jobTitle);
        }
    }
}
