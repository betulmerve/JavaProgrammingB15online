package day31;

public class MethodPractice2 {

    public static void main(String[] args) {

        //write a reusable code to count 1 to 10
        //no need for object when being called:  static
        //it should be accessible everywhere in your project:  public
        //it does not return any value: void

        count1To10();
        count1To10();
    }

    public static void count1To10() {

        for (int x = 1; x <=10 ; x++) {

            System.out.print(x+" ");

        }
        System.out.println();

    }

    //no need for object when being called:  static
    //it should be accessible everywhere in your project:  public
    //it does not return any value: void
    //create a method called countDownFrom20Till1
    //create a method to print odd numbers from 1 to 100: printOddNumbers1to100()
    //create a method to spell your name:  Seda --> S-e-d-a  (excluiding the last dash)

}
