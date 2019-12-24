package day26;

import java.util.Arrays;

public class StrinSplitPractice {
    public static void main(String[] args) {


        String students="Abbos, Zulyar, Zhibek ,Hasan , Muge, Orhan, Susan";


        //first get all the name into String array called namesArray
        //spell the name of each person
        //for example
        //A-b-b-o-s-

        String[] namesArray=students.replace(" ","").split(",");
        //System.out.println(Arrays.toString(namesArray));

        for (int i = 0; i <=namesArray.length-1 ; i++) {
            System.out.println("Spelling of "+namesArray[i]+" is: ");
            for (int x = 0; x <=namesArray[i].length()-1 ; x++) {

                System.out.print(namesArray[i].charAt(x)+"-");
            }
            System.out.println();
        }


        //count of a from each name

        for (int i = 0; i <=namesArray.length-1 ; i++) {
            int count=0;
            for (int x = 0; x <=namesArray[i].length()-1 ; x++) {

                if(namesArray[i].charAt(x)=='a') {
                    count++;
                }
            }
            System.out.println("For "+namesArray[i]+" count of a is "+count);
        }


    }
}
