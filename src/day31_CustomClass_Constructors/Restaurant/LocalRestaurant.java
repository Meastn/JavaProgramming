package day31_CustomClass_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Kebapçı Hasan", "5th Ave",4);
        // SERVERS
        Server server1 = new Server ("Moreen", 112101,12.3, true);
        Server server2 = new Server ("Wonda", 112102,9.3, false);
        Server server3 = new Server ("Daisy", 112102,8.6, false);
        Server server4 = new Server ("Marta", 112104,10.1, true);

        Server [] serverArray = {server1, server2, server3, server4};

        restaurant.hireServers(serverArray);

        Chef chef1 = new Chef ("Gordon Ramsey", 212101, 36.5, false);
        Chef chef2 = new Chef ("Jamie Lee", 212102, 48.5, true);

        Chef [] chefArray = {chef1, chef2};

        restaurant.hireChefs(chefArray);

        System.out.println(restaurant);
    }

}


/*
Create a class LocalRestaurant that has
a main method with the following:
- Make a Restaurant object
- Create an array of servers with their
information set. Add those initial servers
to the ArrayList of Servers in the
Restaurant object
- Create an array of chefs with their
information set. Add those initial chefs
to the ArrayList of Chefs in the
Restaurant object

- Print your whole restaurants information
 */