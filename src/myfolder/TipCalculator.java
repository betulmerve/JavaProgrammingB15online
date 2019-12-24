package myfolder;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        /*
        Write your code inside the method.
        Use the values given as method parameters.
        Assign final values.
        Then user should select service quality that will correspond to tip percent.
        Poor = 5%
        Fair = 10%
        Good = 15%
        Great = 20%
        Excellent = 25%
        The program should display the following information based on the user input:
        Split or No split
        Number of people entered: &&&&
        Service Quality:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:

        Input:
        Split:Yes
        Number of people:4
        Check amount:476.0
        Service Quality:Excellent

        Output:

        Number of people entered: &&&&
        Total to pay: 595.0
        Total tip: 119.0
        Total per person: 148.75
        Tip per person: 29.75

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String split=scan.nextLine();
        System.out.println("Number of people:");
        int numOfPeople=scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality=scan.next();

        double totalTip=0;

        if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip=checkAmount*0.25;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip=checkAmount*0.20;
        } else if(serviceQuality.equalsIgnoreCase("Good")) {
            totalTip=checkAmount*0.15;
        } else if(serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip=checkAmount*0.10;
        } else if(serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip=checkAmount*0.05;
        }

        System.out.print("Number of people entered: ");
        for (int i = 1; i <=numOfPeople ; i++) {

            System.out.print("&");

        }
        System.out.println();

        System.out.println("Total to pay: "+ (checkAmount+totalTip));

        System.out.println("Total tip: "+totalTip);

        System.out.println("Total per person: "+ ((checkAmount+totalTip)/numOfPeople));

        System.out.println("Tip per person: "+ (totalTip/numOfPeople) );

    }
}
