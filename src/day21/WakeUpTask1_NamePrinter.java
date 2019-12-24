package day21;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {
          //           0123456789012345
        String myName="My name is Merve";

        for (int i = 0; i <=myName.length()-1 ; i++) {
           // System.out.print(myName.charAt(i)+"->");   same
            System.out.print(myName.substring(i,i+1)+"->");

        }

        System.out.println();

        //2 character at a time
        for (int i = 0; i <=myName.length()-2 ; i++) {

            System.out.print(myName.substring(i,i+2)+"->");

        }

        System.out.println();

        //3 character at a time
        for (int i = 0; i <=myName.length()-3 ; i++) {

            System.out.print(myName.substring(i,i+3)+"->");

        }

        System.out.println();




        //4 character at a time
        for (int i = 0; i <=myName.length()-4 ; i=i+4) {
            System.out.print(myName.substring(i,i+4)+"->");

        }

    }
}
