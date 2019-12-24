package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1="Superman-Clark Kent";
        //Hero code is Superman and Identity is Clark Kent
        //The initial of the hero is CK

        //logic 1;
        //split this String with dash to two pieces in String array
        //then split the identity with space and take the initials


        String[] heroSplitted=hero1.split("-");
        System.out.println("Hero code is "+heroSplitted[0]+" and Identity is "+heroSplitted[1]);

        //burda da onemli bir nokta var
        //belki middle name vardir diye direkt identity1 demiyoruz da son elementin indexini giriyoruz

        String[] identity=heroSplitted[1].split(" ");
        System.out.println("The initial of the hero is "+identity[0].charAt(0)+identity[identity.length-1].charAt(0));

        //without split method

        String heroCode=heroSplitted[0];
        String fullName=heroSplitted[1];

        System.out.println("Hero code is "+heroCode+" and Identity is "+fullName);

        //logic1:
        //get the first letter of fullname then get letter after space and concatenate them
        //what if we have middle name ?
        //get the first letter of fullname but then
        //get the last space and get the letter after it

        int indexOfSpace=fullName.lastIndexOf(" ");

        System.out.println("The initial of the hero is "+fullName.charAt(0)+fullName.charAt(indexOfSpace+1));




    }
}
