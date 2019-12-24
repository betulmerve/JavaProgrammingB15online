package day29;

import java.util.Arrays;

public class HeroIdentity_JusticeLeague {

    public static void main(String[] args) {


        String[] allHereos={"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};



        for (String eachHero:allHereos) {

            String[] heroSplitted=eachHero.split("-");
            String heroCode=heroSplitted[0];
            String fullName=heroSplitted[1];

            for (int i = 0; i < allHereos.length; i++) {

                String[] allHereosSplitted=allHereos[i].split("-");

            }

            String star="";   //BURDA STAR BOSLUK OLACAK UNUTUYORSUN HEP!!!
            for (int x = 1; x <= fullName.length(); x++) {
                star+="*";
            }

            String heroX=eachHero.replace(heroSplitted[1],star);
            System.out.println("hero = " + eachHero);
            System.out.println("heroX = " + heroX);
        }


        String hero1="Superman-Clark Kent";






    }
}
