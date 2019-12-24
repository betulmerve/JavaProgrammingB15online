package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        //burda da asaida da season diyebiliyoruz
        //birbirlerini gormuyorlar
        //ikisi de sadece kendi methodlari icinde calsiyor
        //String season="Winter";
        String mySeason="Aaa";
        decideSeasonAction("Spring");
        decideSeasonAction("Winter");
        decideSeasonAction(mySeason);


        }

    /*
    write a static method called decideSeasonAction(String season)
    inside method body:
    according to what user passed it should print correct action
     */

    public static void decideSeasonAction(String season) {

        switch (season) {
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Snowboarding");
                break;
            default:
                System.out.println("Invalid season!");

    }
}
}
