package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        //Arrays class a class coming from java.util package
        //it has a lot of pre-build method to work with array object


        //for printing the content of array
        //toString  ----> Arrays.toString(yourArrayHere)
        //String representation of any type of Array

        String[] superHeros={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

        System.out.println(Arrays.toString(superHeros));

        String savingSuperHeroAsString=Arrays.toString(superHeros);

        System.out.println(savingSuperHeroAsString.charAt(0));  //[


        int[] numbers={10,44,55,3,78};

        System.out.println(Arrays.toString(numbers));

        //Task1
        //create a double array, save it pricesString
        //print each char in this String in below format
        //character at index 1 is: yourCharHere

        double[] prices={2.5,3.5,4.5};
        String pricesString=Arrays.toString(prices);

        for (int i = 0; i <=pricesString.length()-1 ; i++) {

            System.out.println("Character at index "+i+" is "+pricesString.charAt(i));

        }

        //TO SOLE PURPOSE OF Arrays.toString(yourArrayHere) is TO SEE WHAT IS INSIDE!!!

    }
}
