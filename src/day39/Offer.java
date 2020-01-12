package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;


    public void displayOfferDetails() {
        System.out.println(location+" | "+company+" | "+ salary+" | "+isFullTime);
    }

    public void add5000() {
        if (salary<100000) {
            salary=salary+5000;
        }
    }

}
