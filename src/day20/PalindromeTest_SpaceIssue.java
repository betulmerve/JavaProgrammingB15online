package day20;

import java.util.Scanner;

public class PalindromeTest_SpaceIssue {

    public static void main(String[] args) {

        //palindrome
        //bastan da sondan da okunusu ayni olan kelime
        // if you reverse the string and it doesnt change
        //it is palindrome
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a name: ");
        String name=scan.nextLine();
        String reversedName="";

        for (int i = name.length()-1 ; i >=0 ; --i) {
            reversedName=reversedName+name.charAt(i);

        }
        System.out.println(reversedName);

        if(reversedName.replace(" ","").equalsIgnoreCase(name.replace(" ",""))) {
            System.out.printf("yes it is palindrome!");
        } else {
            System.out.printf("no it is not a palindrome!");
        }
    }
}
