package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence= "I Love Java";

        //WHAT DOES IT DO?
        //split(bySomething) is a method of String that split string into multiple part
        //DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        //yes, we need to tell what do we use while splitting
        //WHAT DO I GET OUT OF IT?
        //we get out String array
        String[] allWords=sentence.split(" ");
        System.out.println(Arrays.toString(allWords));

        //boylece bir cumlede kac kelime oldugunu kolayca bulabilirsin!
        System.out.println("How many words do i have in this sentence? "+ allWords.length);

        //how do i get to last word of the String?

        System.out.println("Last word of the String is: "+allWords[allWords.length-1]);


        //but only space we can split by anything
        //sadece sunu unutma
        //whatever you use for split it is gone!!
        //kesmek icin onu kullaniyorsun

        String sentence2="Everything is Awesome!!";

        String[] words=sentence2.split("e");
        System.out.println(Arrays.toString(words));

        for (String eachPiece:words) {

            System.out.println("eachPiece: "+ eachPiece);

        }

        //split this sentence by is

        String[] splitByIs=sentence2.split("is");
        System.out.println(Arrays.toString(splitByIs));




    }
}
