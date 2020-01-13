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
        System.out.println("Location= "+location+" | "+"Company= "+company+" | "+"Salary= "+ salary+" | "+"isFullTime= "+isFullTime);
    }

    public void add5000() {
        if (salary<100000) {
            salary=salary+5000;
        }
    }

    public void turnFullTime() {

        isFullTime=true;
    }

    public void changeTheLocation(String newLocation) {
        location=newLocation;
    }

    public void changeAllInfo(String newCompany,String newLoc, long newSalary, boolean newIsFullTime ) {

        company=newCompany;
        location=newLoc;
        salary=newSalary;
        isFullTime=newIsFullTime;

        //an instance method can call another instance method
        displayOfferDetails();
    }

    //write a method to check the offer belong to 100K club and return the result

    public boolean is100KOffer(){

        if (salary>=100000) {
            return true;

        } else {
            return false;
        }

        //sadece boyle de yazabiliriz
        //return salary>=100000;

    }

    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @param
     * @return String representation of Offer Object
     * <p>
     * In below format
     * [Location = Virginia , Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */

    public String toString() {
        return "Location= "+location+" | "+"Company= "+company+" | "+"Salary= "+ salary+" | "+"isFullTime= "+isFullTime;
    }



}
