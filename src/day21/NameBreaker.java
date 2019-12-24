package day21;

public class NameBreaker {

    public static void main(String[] args) {

        String myName="Betul Merve Faki Cakir";

        for (int i = 0; i <=myName.length() ; i++) {

            System.out.println(myName.charAt(i));

            if(myName.substring(i,i+1).equalsIgnoreCase("f")) {
                System.out.println("found it!");
                break;
            }

           // System.out.println(myName.charAt(i)); eger buraya koyarsan F basmaz

        }
    }
}
