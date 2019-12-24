package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {

        // opposite result
        // flip the coin
        // IT CAN NOT BE USED ANY OTHER DATA TYPE EXPECT BOOLEAN!!

        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);

        boolean isRecording=false;
        System.out.println(!isRecording);

        // also you can use it in front of a boolean expression
        System.out.println(!(7>5));

        int x=10;
        System.out.println(!(x>10));

        // !(x>10)  ---->   x<=10

    }
}
