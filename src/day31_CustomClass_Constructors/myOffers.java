package day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("Atlanta", "codeBulls", "Developer", 107500, true, true, true, true);
        offer2.setInfo("New York", "Trilobites", "Scrum Master", 41200, true, false, false, true);
        offer3.setInfo("Atlanta", "CrazyMachine", "Developer", 57100, true, true, false, true);
        offer4.setInfo("Orlando", "Field Works", "Farmer", 17400, false, false, true, false);
        offer5.setInfo("Atlanta", "Daisy Load", "SDET", 133600, true, true, true, false);
        offer6.setInfo("San Fransisco", "Up Hill", "SDET", 37600, false, false, true, false);
        offer7.setInfo("Las Vegas", "Gamble Through", "Gambler", 101400, false, true, true, true);


        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p -> p.location != "Atlanta");
        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offers));
        offersWithBenefits.removeIf(p-> p.hasBenefit==false &&  p.hasPTO == false);
        ArrayList <Offer> sdetOffers = new ArrayList<>(Arrays.asList(offers));
        sdetOffers.removeIf( p-> p.jobTitle != "SDET");
        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary < 100000);

        System.out.println("---Full Time Offers--");
        System.out.println("Number of  Offers = " + fullTimeOffers.size());

        for (Offer offer : fullTimeOffers) {
            System.out.print(offer.companyName + " : $" + offer.salary + ", ");
        }
        System.out.println();
        System.out.println("---Local Offers--");
        System.out.println("Number of Offers = " + localOffers.size());
        for (Offer offer : localOffers) {
            System.out.print(offer.companyName+ " : $" + offer.salary + ", ");
        }
        System.out.println();
        System.out.println("---Offers With Benefits:--");
        System.out.println("Number of  Offers = " + offersWithBenefits.size());

        for (Offer offer : offersWithBenefits) {
            System.out.print(offer.jobTitle +  " : $" + offer.salary + ", ");
        }
        System.out.println();
        System.out.println("---Offers for SDET positions--");
        System.out.println("Number of  Offers =  " + sdetOffers.size());
        for (Offer offer : sdetOffers) {
            System.out.print(offer.companyName +  " : $" + offer.salary + ", ");
        }
        System.out.println();
        System.out.println("---Higher than 100K salary--");
        System.out.println("Number of  Offers =  " + offersWith100K.size());
        for (Offer offer : offersWith100K) {
            System.out.print(offer.companyName +  " : $" + offer.salary + ", ");
        }




    }


}
