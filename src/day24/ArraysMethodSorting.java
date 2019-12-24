package day24;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores={99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));

        //for sorting an Array in ascending order --- low to high
        //sort   ----> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        //you are modifying your existing array

        char[] nameChars={'A',' ','d','B','f','9'};

        //System.out.println(nameChars);
        System.out.println(Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));

        //the low the high order for character is designed by ASCII table value
        //special character come first, then numbers, uppercase then lowercase


        //sorting a String
        //ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY

        //sonuna 100 ve 9 ekledik ama bunlar String olarak dusun sadece ilk characteri onemli o yuzden
        //once 100 sonra 9 cunku sadece 1 ve 9 olarak goruyor
        String[] superHeros={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash","100","9","09","102"};
        System.out.println(Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println(Arrays.toString(superHeros));

        //sorting boolean----ARRAYIN METHODU BOOLEAN SORT ETMIYOR!!
        boolean[] fiveSwitchOnOffs={true,false,false,true,true} ;
        System.out.println(Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs);  HATA VERIYOR



        //Arrays.sort() does not give us a value that we can store
        // it is just reshuffle the index of original array object to keep it in sorted order

    }
}
