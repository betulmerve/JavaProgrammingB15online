package day36;

public class MethodPractice {

    public static void main(String[] args) {

        /*
        write a static method to accept a String and return Boolean(Yes Uppercase) .
        it should return true if the String contains at least one number.
         */
        System.out.println(checkIfStringHasNumber("12abc"));
        System.out.println(checkIfStringHasNumber("abc"));


    }

    public static Boolean checkIfStringHasNumber (String str) {

        for (int x = 0; x < str.length(); x++) {
            if (Character.isDigit(str.charAt(x))) {
                return Boolean.valueOf(true);
            }

        }
        return Boolean.valueOf(false);

    }


}
