package day21;

public class CountSomethingInString {

    public static void main(String[] args) {

        //find index of all the word an in cases insensitive manner
        //go through each and every char by 3

        //3 character ararken
        //x<=lenght-3 diyoruz veya x<=lastcharindex-2 ayni sey ztn
        //o yuzden n character ararken de
        //x<=length-n veya x<=lastcharindex-n-1 diyoruz

        String myName="Amelia Israfil Mammadov";

        int charCount=myName.length();
        int lastCharIndex=charCount-1;
        int counter=0;


        for (int x = 0; x <=lastCharIndex-2 ; x++) {

            if(myName.substring(x,x+3).equalsIgnoreCase("lia")) {

                //System.out.println("Index of lia is: "+x);
                counter++;
            }
            
        }
        System.out.println("Count of Lia is: "+ counter);
    }
}


