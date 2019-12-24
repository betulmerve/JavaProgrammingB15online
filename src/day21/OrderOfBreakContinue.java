package day21;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {

            //break;

            continue;
            //this will not work, unreachable code!
            //System.out.println("Hello!");

        }
        System.out.println("The end!");
    }
}
