package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blabla=new Scanner(System.in);

//        System.out.println("What is you name?");
//        String name=blabla.next(); //it will only capture first word separated by space
//        System.out.println("You entered "+name);

        System.out.println("What is you name?");
        String name1=blabla.nextLine(); //it will capture whole line
        System.out.println("You entered "+name1);

        System.out.println("Where do you live including state?");
        String cityAndState=blabla.nextLine();
        System.out.println("You entered "+cityAndState);

        System.out.println("What is your street address?");
        String address=blabla.nextLine();
        System.out.println("You entered "+address);


    }
}
