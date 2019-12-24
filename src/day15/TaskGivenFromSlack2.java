package day15;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskGivenFromSlack2 {

    public static void main(String[] args) {

        /*
        Task 1:
        Given a String with any possible length including 0
        print first 2 characters only if the String has more than 1 character
        if the String is empty print Empty String
        else print the first char twice in same Link
            for example :
                "abcde" --> ab
                ""        --> empty String
                "J"       --> JJ
        Task 2: Done
        */
//
//        String name="J";
//
//        if(name.length()==0) {     //name.isEmpty()
//            System.out.println("empty string");
//        } else if (name.length()>1) {
//            System.out.print(name.substring(0,2));
//            System.out.println();
//        } else if(name.length()==1) {
//            System.out.println(name+name);
//        }

        /*
        Task 3:
        Ask user to enter full name
        assuming full name is 2 word
        Write a program to print users initials
        for example :
        Jon Snow -->> Initial is JS
        */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter your full name: ");
//        String fullName=scan.nextLine();
//
//        int indexOfSpace=fullName.indexOf(" ");
//        System.out.print("Initial is ");
//        System.out.println(fullName.substring(0,1)+fullName.substring(indexOfSpace+1,indexOfSpace+2));

        /*
        Task 4:
        Ask user to enter a word with at least 3 characters
        print the first character
        print the last character
        print the middle character
        for example : Uighur
        first character : U
        last character  : r
        middle character: g
        (if the length is even number get the one on the left)
        */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a word with at least 3 characters: ");
//        String word=scan.next();
//
//
//            System.out.println("First character: "+ word.charAt(0));
//            System.out.println("Last character: "+ word.charAt(word.length()-1));
//            System.out.println("Middle character: "+ word.charAt(word.length()/2));


        /*
        Task 5:
        given a name with prefix, stored in a String variable called name
        for example
            Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
        -- in case insensitive condition ----
        print as below
        if the name Started with (Dr )-->> Doctor
        if the name Started with (Mr )-->> Male
        if the name Started with (Miss )-->> Single female
        if the name Started with (Mrs )-->> Married female
        */

//        String name="Mrs Dru";
//        String upperCaseName=name.toUpperCase();
//
//        if (upperCaseName.startsWith("DR")) {
//            System.out.println("Doctor");
//        } else if (upperCaseName.startsWith("MR")) {
//            System.out.println("Male");
//        } else if (upperCaseName.startsWith("MISS")) {
//            System.out.println("Single female");
//        } else if (upperCaseName.startsWith("MRS") ) {
//            System.out.println("Married female");
//        }


        /*
        Task 6:
        Ask user to enter full name
        assuming full name is 2 word
        Write a program generate email account as below:
        it starts with first character of first name
        and whole last name then @NightWatch.com
        for example :
        Jon Snow -->> JSnow@NightWatch.com
        */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter your full name: ");
//        String fullName=scan.nextLine();
//
//        int firstIndexOfLastName=fullName.indexOf(" ")+1;
//
//        System.out.println(fullName.charAt(0)+fullName.substring(firstIndexOfLastName)+"@NigthWatch.com");


        /*
        Task 7:
        Ask user to enter valid email address
        for example :
         JSnow@NightWatch.com or
         Arya@KingsLanding.edu
         print 3 part of the email separately
         for example :
         Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
         Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

         */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a valide email address: ");
//        String email=scan.nextLine();
//
//        int indexOfAt=email.indexOf("@");
//        int indexOfDot=email.indexOf(".");
//
//        System.out.print("Part1 ->");
//        System.out.println(email.substring(0,indexOfAt));
//
//        System.out.print("Part2 ->");
//        System.out.println(email.substring(indexOfAt+1,indexOfDot));
//
//        System.out.print("Part3 ->");
//        System.out.println(email.substring(indexOfDot+1));


        /*

        Task 8:
        Ask user to enter a sentence
        Assuming the sentence has at least 2 words
        also assuming there is single space between words
        -->
        first trim empty spaces in two sides
        then
        check if the first index of space
        is equal to last index of the space
        if so print you have entered two words
        else print you have more than 2 words
        For example :
        Jon Snow -->>
        first index of the space is 3
        last index of the space is also 3
        this means there is only 2 words
        King in the North -->>
        first index of the space is 4
        last index of the space is also 11
        this means there is more than 2 words
        */

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String sentence=scan.nextLine();
//        sentence=sentence.trim();
//        System.out.println("First index of space is "+sentence.indexOf(" "));
//        System.out.println("Last index of space is "+sentence.lastIndexOf(" "));
//        if (sentence.indexOf(" ")==sentence.lastIndexOf(" ")) {
//            System.out.println("This means there is only two words");
//        } else {
//            System.out.println("This means there is more than two words");
//        }


        /*
        Task 9:
        Ask user to enter a valid URL in below format
        www.blackfriday.com
        Write a program to print first Index of .(dot)
        and last index of .(dot)
        and eventually print the domain
        for example :
        www.nightwatch.com  --->> blackfriday
        */

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a valid URL:");
//        String url=scan.next();
//
//        if (url.startsWith("www.") && url.endsWith(".com")) {
//            int firstIndexOfDot=url.indexOf(".");
//            int lastIndexOfDot=url.lastIndexOf(".");
//            System.out.println("Domain is "+url.substring(firstIndexOfDot+1,lastIndexOfDot));
//
//        } else {
//            System.out.println("It is not a valid URL!");
//        }

        /*

        Task 10:
        Ask user to enter sentence with 3 words
        For example I love Java
        write a program to print second word
        */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a sentence with 3 words:");
//        String sentence=scan.nextLine();
//        int firstIndexOfSpace=sentence.indexOf(" ");
//        int lastIndexOfSpace=sentence.lastIndexOf(" ");
//        System.out.println("The second word of this sentence is: "+sentence.substring(firstIndexOfSpace+1,lastIndexOfSpace));

        /*
        Task 11:
        Ask user to enter sentence with more than 1 word
        For example I love Java
        write a program to
        print first word and last word
        */
//                Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a sentence with more than 1 word:");
//        String sentence=scan.nextLine();
//        int firstIndexOfSpace=sentence.indexOf(" ");
//        int lastIndexOfSpace=sentence.lastIndexOf(" ");
//        System.out.println("The first word of this sentence is: "+sentence.substring(0,firstIndexOfSpace));
//        System.out.println("The last word of this sentence is: "+sentence.substring(lastIndexOfSpace+1));



        /*
        Task 12:
        Given a String with at least two characters
        swamp first character with last character
        for example
            Java --> aavJ , Kawap --> pawaK

            */
//        String name="Java";
//        char firstChar=name.charAt(0);
//        char lastChar=name.charAt(name.length()-1);
//
//        String nameRemaining=name.substring(1,name.length()-1);
//
//        System.out.println(lastChar+nameRemaining+firstChar);


        /*
        Task 13:
        Given a String with 3 characters
        swamp first character with last character
        and check whether new String is same as old one
        if so print Palindrome
        */

//        String word="mam";
//
//        char firstChar=word.charAt(0);
//        char lastChar=word.charAt(2);
//        char middleChar=word.charAt(1);
//
//        String newWord=""+lastChar+middleChar+firstChar;
//
//        if (newWord.equals(word)) {
//            System.out.println("It is palindrome!");
//        } else {
//            System.out.println("It is not a palindrome");
//        }


        /*
        Task 14:
        Ask user to enter sentence with any number of words
        For example I love Java Java Java Java
        write a program to print last word
        remove last word from the sentence
        check weather remaining part still contains last word
        for example :
        1, I love Java Java Java Java  -->> Java
        2, I love Java Java Java
        3, I love Java Java Java still contains last word
        */





        /*
        Task 15:
        Given a String str with 3 characters:
        for example : DEV
        Store each character into 3 char variables
        Store ASCII number of each character into int variables
        hint : store char into int to get ASCII number
        Then print it out by concatenating as below :
        "DEV IS NOW --> D68E69V86"
        Task 16:
        Enter user to ask two words
        and store it into word1 word2 String variables
        if word1 contains word2 ,
            print the location of word2 in word1
        for example ABCDE , BC  -->> BC is at index 1 in word1
        then replace word2 part of word1 with ZZZ
        for example ABCDE , BC  -->> AZZZDE
        if word2 exists in word1 , replace word1 with ZZZ
        for example BC , ABCDE    -->> AZZZDE

         */


    }
}
