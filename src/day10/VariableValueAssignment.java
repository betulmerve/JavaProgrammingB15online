package day10;

public class VariableValueAssignment {

    public static void main(String[] args) {

        int offerCount=3;
       // String message; //this is declaring
       // message=""; //this is assigning a value

        String message=""; //you need to initialize, dont forget!

        if (offerCount>3) {
            message="great job!";

        }
        System.out.println(message);
    }
}
