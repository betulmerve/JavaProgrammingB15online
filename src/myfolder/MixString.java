package myfolder;

public class MixString {

    public static void main(String[] args) {

        /*
        Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"
         */
//        System.out.println(mixString("abc", "xyz"));
//        System.out.println(mixString("Hi", "There"));
//        System.out.println(mixString("xxxx", "There"));

//        System.out.println(repeatEnd("Hello", 3));
//        System.out.println(repeatEnd("Hello", 2));
//        System.out.println(repeatEnd("Hello", 1));

        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }

    public static String mixString(String a, String b) {

        String mixed="";
        if (a.length()==b.length()) {
            for (int x = 0; x < a.length(); x++) {
               mixed=mixed+a.charAt(x)+b.charAt(x);

            }
        } else if(a.length()>b.length()) {
            for (int y = 0; y < b.length(); y++) {
                mixed= mixed+a.charAt(y)+b.charAt(y);
            }
                mixed=mixed+a.substring(b.length());

        } else if (b.length() > a.length()){
            for (int z = 0; z < a.length(); z++) {
                mixed=mixed+a.charAt(z)+b.charAt(z);
            }
                mixed=mixed+b.substring(a.length());
        }
      return mixed;

    }


    /*

    Given a string and an int n, return a string made of n repetitions of the
    last n characters of the string. You may assume that n is between 0 and the
    length of the string, inclusive.


    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
     */

    public static String repeatEnd(String str, int n) {

        String repeat="";


        for (int i = 1; i <=n ; i++) {
            repeat=repeat+str.substring(str.length()-n);

        }
        return repeat;
    }

    /*

        Given a string and an int n, return a string made of the
        first n characters of the string, followed by the first n-1 characters
        of the string, and so on. You may assume that n is between 0 and the
        length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


        repeatFront("Chocolate", 4) → "ChocChoChC"
        repeatFront("Chocolate", 3) → "ChoChC"
        repeatFront("Ice Cream", 2) → "IcI"
     */

    public static String repeatFront(String str, int n) {

        String repeat="";
        int temp=n;

        for (int i = 1; i <=temp ; i++) {
            repeat=repeat+str.substring(0,n);
            n--;

        }
        return repeat;

    }
}
