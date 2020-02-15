package myfolder;

public class Utils {

    public static void main(String[] args) {

//        String result = Utils.reverseLetters("..zxcv..d");
//        System.out.println(result.equals("..dvcx..z")); //true
//
//        String result2 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result2.equals("---olkmb.a-")); //true
//
//        String result3 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result3.equals("-o.lkmba---")); //false

        System.out.println(reverseLetters("ab,cd!"));

    }

    public static String reverseLetters(String word) {
//            word="ab,cd!";
        //reversed="!dc,ba";
        String reversed="";
        String result="";

        for (int x = word.length()-1; x >=0 ; x--) {
            if (Character.isLetter(word.charAt(x))) {
                reversed=reversed+word.charAt(x);
            }
        }

        System.out.println(reversed);


        return result;

    }


}

/*

Reverse a string without affecting special characters
Given a string, that contains special character together with alphabets
(‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---"
Output:  str = "----dgf--y--tre...wq.---"
 */
