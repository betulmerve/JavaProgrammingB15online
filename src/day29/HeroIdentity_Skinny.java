package day29;

import java.util.Arrays;

public class HeroIdentity_Skinny {

    public static void main(String[] args) {


        String hero1="Superman-Clark Kent";
       //LESS CODE!

        String[] heroSplitted=hero1.split("-");
        //String heroCode=heroSplitted[0];
        //String fullName=heroSplitted[1];

        String star="";   //BURDA STAR BOSLUK OLACAK UNUTUYORSUN HEP!!!

        for (int x = 1; x <= heroSplitted[1].length(); x++) {
            star+="*";
        }
        //String heroX=hero1.replace(heroSplitted[1],star);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(heroSplitted[1],star));




    }
}
