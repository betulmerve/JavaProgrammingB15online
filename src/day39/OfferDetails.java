package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfferDetails {

    public static void main(String[] args) {

        Offer o1=new Offer();
        Offer o2=new Offer();
        Offer o3=new Offer();
        Offer o4=new Offer();
        Offer o5=new Offer();

        o1.location="Hartford";
        o1.company="AT&T";
        o1.salary=100000;
        o1.isFullTime=true;
        //o1.displayOfferDetails();

        o2.location="West Haven";
        o2.company="Pfizer";
        o2.salary=90000;
        o2.isFullTime=false;
        //o2.displayOfferDetails();

        o3.location="Milford";
        o3.company="Grubhub";
        o3.salary=80000;
        o3.isFullTime=true;
        //o3.displayOfferDetails();

        o4.location="West Hartford";
        o4.company="Verizon";
        o4.salary=120000;
        o4.isFullTime=true;
        //o4.displayOfferDetails();

        o5.location="Florida";
//        o5.company="Great Job";
        o5.salary=70000;
        o5.isFullTime=false;
        //o5.displayOfferDetails();

        //how do i add 2K to Verizon offer
        o4.salary=o4.salary+2000;
        //o4.salary+=2000;
        System.out.println("new Verizon salary = " + o4.salary);

        //set the o5 salary value of sum of all the offers
        o5.salary=o1.salary+o2.salary+o3.salary+o4.salary;
        o5.displayOfferDetails();
        o5.turnFullTime();

        //change location with method
        o5.changeTheLocation("Austin");
        o5.displayOfferDetails();


        o1.changeAllInfo("Amazon","Virginia",150000,true);
        //o1.displayOfferDetails();


        //if this guy earn more than 100K
        //move him to Atlanta

        boolean result=o1.is100KOffer();
        if (result==true) {
            o1.changeTheLocation("Atlanta");
        }
        o1.displayOfferDetails();


        System.out.println("-----end-----");


        List<Offer> myOffers=new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5));

        System.out.println("--------for each loop------------");

        for (Offer eachOffer:myOffers) {

            eachOffer.displayOfferDetails();

        }

        System.out.println("--------for loop------------");

        for (int x = 0; x < myOffers.size(); x++) {

//            Offer each=myOffers.get(x);
//            each.displayOfferDetails();
            myOffers.get(x).displayOfferDetails();

        }

        System.out.println("---add5000----");

        for (Offer eachOffer:myOffers) {

            eachOffer.add5000();
            eachOffer.displayOfferDetails();

        }


    }
}
