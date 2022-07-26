package day31_CustomClass_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList <Server> serverList = new ArrayList<>();
    public ArrayList <Chef> chefList = new ArrayList<>();

    public Restaurant (String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }



    public void hireServer (Server server){
        serverList.add(server);
    }
    public void hireServers (Server [] servers) {
        serverList.addAll(Arrays.asList(servers));
    }

    public void hireChef (Chef chef){
        chefList.add(chef);
    }
    public void hireChefs (Chef [] chefs) {
        chefList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef (int employeeID) {
        chefList.removeIf(p-> p.employeeID == employeeID);
    }
    public void terminateServer (int employeeID) {
        serverList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + serverList.size() +
                ", number of chefs=" + chefList.size() +
                '}';
    }
}
