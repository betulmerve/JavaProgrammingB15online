package day13;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already now
        // .equals()

        String s1="Hello";
        System.out.println(s1.equals("abc"));
        // .equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase("HELLO"));


        //toUpperCase used to make String all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        //toLoweCase used to make String all character lowercase
        System.out.println(s1.toLowerCase());

        String name="Merve";
        System.out.println("My name is "+ name);
        System.out.println("My name is " + name.toLowerCase());
        System.out.println("My name is " + name.toUpperCase());
        String myLowerCaseName=name.toLowerCase();
        System.out.println("My name is " + myLowerCaseName);

        // in order to get how many character we have inside String
        // we can use length() method
        System.out.println(s1.length());  // arada bosluk, tab varsa onlari da sayiyor unutma!
        int lengthOfString=s1.length();

        if(lengthOfString>4) {
            System.out.println("More than 4 character");
        } else {
            System.out.println("Not more than 4");
        }




    }
}
