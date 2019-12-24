package day12;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName="abc123";

        //password icin case sensitive olmasi lazim
        boolean userNameCorrect=userName.equals("ABC123") ;

        System.out.println(userNameCorrect);

        //mesela mail adresi icin case sensitive olmayabilir
        //ya da bazen equality bakarken case sensitive olmasin diyebilirsin
        boolean userNameCorrect2=userName.equalsIgnoreCase("ABC123");

        System.out.println(userNameCorrect2);

        String name="Merve";

        System.out.println(name.equals("Merve"));  //true
        System.out.println(name.equalsIgnoreCase("merve")); //true
        System.out.println(name.equalsIgnoreCase("meerve")); //false
        System.out.println(name.equals("merve")); //false
    }
}
