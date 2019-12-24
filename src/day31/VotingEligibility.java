package day31;

public class VotingEligibility {

    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);

        //cannot access the method parameter outside of method
        //System.out.println(age);

        int yourAge=12;
        checkEligibility(yourAge);

    }

    // the method parameter can be only accessible within the method
    //
    public static void checkEligibility(int age) {

        if (age>18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }

    }
}
