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
        o5.company="Great Job";
        o5.salary=70000;
        o5.isFullTime=false;
        //o5.displayOfferDetails();


        List<Offer> myoffers=new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5));

        for (Offer eachOffer:myoffers) {

            eachOffer.add5000();

        }
        for (Offer eachOffer:myoffers) {

            eachOffer.displayOfferDetails();

        }


    }
}
