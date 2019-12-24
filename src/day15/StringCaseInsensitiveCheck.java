package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name="Arya Stark";
        System.out.println("name.contains(\"st\") result is "+ name.contains("st"));

       String upperCaseNAme=name.toUpperCase();
        System.out.println("uppercasename contains ST or not? " + upperCaseNAme.contains("ST"));


        String lowerCaseName=name.toLowerCase();
        System.out.println("lowercasename contains st or not? " +lowerCaseName.contains("st"));

        // This is called method chaining, combining multiple method call
        // make my name all lowercase then check contains st


        System.out.println(name.toLowerCase().contains("st"));




    }
}
