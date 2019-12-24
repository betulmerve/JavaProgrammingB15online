package day21;

public class DecidingWhenToStop {

    public static void main(String[] args) {
//                  01234567890
        String msg="Hello World";

        int charCount=msg.length();
        int n=4; //count of char to iterate
        System.out.println(charCount);

        for (int x = 0; x <=charCount-n ; x++) {
            System.out.println(msg.substring(x,x+n));

        }


    }
}
