package day14;

public class PasswordValidator {

    public static void main(String[] args) {

        //PASSWORD VALIDATOR
        //MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAIN _ OR $
        // IT MUST NOT CONTAIN SPACE
        // IT MUST START WITH Ab

        // it not matched INVALID PASSWORD
        // else say GOOD PASSWORD!

        String password="Ab_$H1267abh";

        boolean min8max16= password.length()>=8 && password.length()<=16 ;

        boolean mustContains_Or$= password.contains("_") || password.contains("$") ;

        boolean mustNotContains= !password.contains(" ");

        boolean mustStartsWith= password.startsWith("Ab");

        if (min8max16 && mustContains_Or$ && mustNotContains && mustStartsWith) {

            System.out.println("Good password!");
        } else {
            System.out.println("Invalid password");
        }
    }
}
