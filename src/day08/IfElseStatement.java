package day08;

public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit=60;

        int yourCurrentSpeed=100;

        // if the current speed is more than limit get pulled over by police
        //if not over the limit go shopping
        // outside the statment end

        boolean IamSpeeding= (yourCurrentSpeed>speedLimit) ;

        //System.out.println(amISpeeding);

        // if (true)
        //if (IamSpeeding)
        // if (yourCurrentSpeed>speedLimit)
        if (IamSpeeding) {
            System.out.println("Get pulled over by police");
            System.out.println("Get the ticket");
        } else {
            System.out.println("Go shopping");
            System.out.println("enjoy your day");
        }

        System.out.println("The end!");



    }
}
