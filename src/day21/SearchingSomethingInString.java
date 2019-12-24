package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName="Hasan Mammadov";

        int charCount=myName.length();
        int lastCharIndex=charCount-1;
        int countOfA=0;


        for (int x = 0; x <=lastCharIndex ; x++) {

            if(myName.substring(x,x+1).equalsIgnoreCase("a")) {

                System.out.println("Index of a or A is: "+x);
                countOfA++;
            }
            
        }
        System.out.println();
        System.out.println("Count of A: "+ countOfA);
    }
}
