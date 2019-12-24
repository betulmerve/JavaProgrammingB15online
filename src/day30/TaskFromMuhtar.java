package day30;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFromMuhtar {

    public static void main(String[] args) {

        /*
        1. write a program that can check if a string is build out of the same letters as another string
		Ex: input:
				str1 = "abc";
				str2 = "cba";
			output:
				true

		*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first word:");
        String str1=scan.next();
        System.out.println("Please enter second word:");
        String str2=scan.next();

        char[] str1Array=str1.toCharArray();
        char[] str2Array=str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);


        if (Arrays.equals(str1Array,str2Array)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        /*
        2. Write a program that will remove all the dupplicates from a string
				Do it withg Arrays only
		*/

        String word1="hdkkkfffgcbd";
        String word2="";

        String[] arrWord1=word1.split("");

        for (String eachChar:arrWord1) {

            if (!word2.contains(eachChar)) {
                word2=word2+eachChar;
            }

        }

        System.out.println(word2);


        /*
	    3. given the array of names:
			String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   write a program that can remove all the names named Ahmed from the array
	   Ex:
	   		names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   		System.out.println( Arrays.toString(names) );
	   		output:
	   			[John, Eric, Hassan]
         */

        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};

        String namesWithoutAhmed="";

        for (int x = 0; x < names.length; x++) {

            if (names[x].equals("Ahmed")) {
                continue;
            } else {
               namesWithoutAhmed=namesWithoutAhmed+names[x]+" ";
            }

        }

        String[] namesAhmedLess=namesWithoutAhmed.split(" ");

        System.out.println(Arrays.toString(namesAhmedLess));


    }
}
