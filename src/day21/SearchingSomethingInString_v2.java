package day21;

public class SearchingSomethingInString_v2 {

    public static void main(String[] args) {

        //find index of all the word an in cases insensitive manner
        //go through each and every char by 2

        String myName="Hasan Mammadov";

        int charCount=myName.length();
        int lastCharIndex=charCount-1;
        //int countOfA=0;


        for (int x = 0; x <=lastCharIndex-1 ; x++) {

            if(myName.substring(x,x+2).equalsIgnoreCase("an")) {

                System.out.println("Index of an is: "+x);
                //countOfA++;
            }
            
        }
    }
}
