package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHereos={"Iron Man","Captain America","Spiderman",
                "Black Panter","Hulk","Black Widow","Wanda","Captain Marvel",
                "Captain America","Spiderman","Black Widow","Wanda",
                "Captain America","Captain Marvel"};

        System.out.println(Arrays.toString(marvelHereos));

        String itemToSearch="Captain America";
        int countOfItem=0;

        for (String each:marvelHereos) {

            if (each.equals(itemToSearch)) {
                countOfItem++;
            }

        }

        System.out.println("Count of "+itemToSearch+" is "+countOfItem);


        int countOfBlack=0;
        Arrays.toString(marvelHereos).toUpperCase();

        for (String each:marvelHereos) {

            if (each.contains("BLACK")) {
                countOfBlack++;
            }

        }

        System.out.println("Count of Black is "+countOfBlack);

        String longestWord=marvelHereos[0];
        for (String each:marvelHereos) {

            if (each.length()>longestWord.length()) {
                longestWord=each;
            }

        }

        System.out.println("The longest word is :"+longestWord);




    }
}
