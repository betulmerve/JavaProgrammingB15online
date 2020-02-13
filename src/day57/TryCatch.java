package day57;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println("before try catch");
        try {
            System.out.println("in try block");
            int result=10/2; //burada exception oldu, direkt catch e gitti o yuzden line11 run edilmiyor
            System.out.println("after line 10");
        } catch (ArithmeticException e) {
            System.out.println("exception happened, and was caught and handled!");
        }
        System.out.println("after try catch");

        System.out.println("===================");


        try{
            System.out.println("In second try block");
            String str="Java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e) {
            System.out.println("Exception happened in try block and caught!");
        }
        System.out.println("after second try catch!");
    }
}
