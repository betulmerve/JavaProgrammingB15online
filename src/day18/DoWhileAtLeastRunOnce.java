package day18;

public class DoWhileAtLeastRunOnce {

    public static void main(String[] args) {

        // while loop VS do while loop
        /*
        while loop checks the condition first then enter the statement
        do while loop will take the action at least once then check the condition statment
        do while loop always run at least one iteration!!!

         */

        //mutlaka bir kere basiyor!! sonra check ediyor

        int x=1000;

        do {
            System.out.println("Keep going!");
        } while (x<5);

        System.out.println("The end!");

    }
}
