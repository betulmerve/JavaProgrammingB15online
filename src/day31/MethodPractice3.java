package day31;

public class MethodPractice3 {

    //create a method called countDownFrom20Till1
    //create a method to print odd numbers from 1 to 100: printOddNumbers1to100()
    //create a method to spell your name:  Seda --> S-e-d-a  (excluiding the last dash)
    public static void main(String[] args) {

        countDownFrom20Till1();
        printOddNumbers1To100();
        spellYourName();


    }


    public static void countDownFrom20Till1() {

        for (int x = 20; x >=1 ; x--) {

            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static void printOddNumbers1To100() {
        for (int x = 1; x <=100 ; x++) {

            if (x%2==1) {
                System.out.print(x+" ");
            }

        }
        System.out.println();

    }

    public static void spellYourName() {
        String name="Merve";

        for (int i = 0; i < name.length(); i++) {

            if (i== (name.length()-1) ) {
                System.out.print(name.charAt(i));
            } else {
                System.out.print(name.charAt(i)+"-");
            }

        }

    }

}
