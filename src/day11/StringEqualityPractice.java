package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        // just comparing 2 String literal

        // this is really rare to use
        System.out.println("Java".equals("java"));



        String myString="Java";

        System.out.println(myString.equals("Java"));


        String youStr=new String("Java");

//        System.out.println(myString.equals(youStr));
//
//
//        if (myString.equals("Java")) {
//
//            System.out.println("Correct word!");
//        } else {
//            System.out.println("Say Java!");
//        }
//
//        if (myString.equals(youStr)) {
//            System.out.println("Correct!");
//        } else {
//            System.out.println("Wrong!");
//        }


        if (myString.equals("Java")) {

            System.out.println("Correct word!");
        } else if (myString.equals("Cava")) {

            System.out.println("Pumpkin!");
        } else {
            System.out.println("Not Java nor pumpkin!");
        }

    }
}
