package day29;

import java.util.Arrays;

public class HeroIdentity {

    public static void main(String[] args) {


        String hero1="Batman-Bruce Wayne";
        //"Superman-Clark Kent"
        //hide this hero identity
        //String heroX="Superman-**********";

        //given a String with hero code and name seperated by dash
        //turn this into herocode and * with same length as hero name

        //logic1:
        //first split this name by dash, keep the first item
        //for second item first count the characters then
        //generate stars with same count

        String[] heroSplitted=hero1.split("-");
        System.out.println(Arrays.toString(heroSplitted));

        String heroCode=heroSplitted[0];
        String fullName=heroSplitted[heroSplitted.length-1];

        String star="";   //BURDA STAR BOSLUK OLACAK UNUTUYORSUN HEP!!!

        for (int x = 0; x < fullName.length(); x++) {

            star=star+"*";

        }

        String heroX=heroCode+"-"+star;
        System.out.println(heroX);





    }
}
