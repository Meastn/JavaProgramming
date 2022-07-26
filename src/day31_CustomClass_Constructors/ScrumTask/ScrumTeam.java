package day31_CustomClass_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public int daysOfSprint;
    public ArrayList <Testers> testersList = new ArrayList<>();
    public ArrayList <Developers> devsList = new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }


    // ACTIONS
    public void addTester (Testers tester){
        testersList.add(tester);
    }
    public void addTesters (Testers [] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper (Developers developer){
        devsList.add(developer);
    }

    public void addDevelopers (Developers [] developers){
        devsList.addAll(Arrays.asList(developers));
    }

    public void removeTester (int employeeID){
        testersList.removeIf(p -> p.employeeID == employeeID);
    }
    public void removeDeveloper (int employeeID){
        devsList.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                ", total number of testers =" + testersList.size() +
                ", total number of developers=" + devsList.size() +
                '}';
    }
}


/*
String PO, BA, SM;
ArrayList <Tester> testersList = new ArrayList<>();
ArrayList <Developer> devsList = new ArrayList<>();
int daysOfSprint;

Add a constructor that can set all the fields of PO, BA and SM
 */