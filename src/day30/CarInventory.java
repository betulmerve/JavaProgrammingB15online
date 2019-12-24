package day30;

public class CarInventory {

    public static void main(String[] args) {


        String[] carInventory={"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        /*
                Create a class called CarInventory with main
                 count how many Chevrolet is in this array
                 and how many civic you have
         */

        int countOfChv=0;
        int countOfCivic=0;

        for (String each:carInventory) {

            if (each.contains("Chevrolet")) {
                countOfChv++;
            }

            if (each.contains("Civic")) {
                countOfCivic++;
            }

        }

        System.out.println("There are "+countOfChv+ " Chevrolet in this array");
        System.out.println("There are "+countOfCivic+ " Civic in this array");
    }
}
