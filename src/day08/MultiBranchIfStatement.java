package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        /*
        Given you current speed and speedlimit
        check whether current speed is

        more than 90   jail
        more than 80 less than 90  reckless driving
        more than 70 less than 80  point taken
        more than 60 less than 70  warning

        if not speeding keep driving
         */

        int currentSpeed=60;
        int speedLimit=60;

        if (currentSpeed>90) {
            System.out.println("Jail");
        } else if(currentSpeed>80) {
            System.out.println("Reckless driving");
        } else if(currentSpeed>70) {
            System.out.println("Point taken");
        } else if(currentSpeed>60) {
            System.out.println("Warning");
        } else {
            System.out.println("Keep driving");
        }
    }
}
