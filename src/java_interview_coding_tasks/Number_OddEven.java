package java_interview_coding_tasks;

public class Number_OddEven {

    /*
    Write  a method which can identifies given number is even or odd

        EX:

        identify(5) ->  "Odd"

        identify(6) ->  "Even"
     */
    public static void main(String[] args) {

        System.out.println(identifyNumber(5));
        System.out.println(identifyNumber(6));

    }

    public static String identifyNumber(int num) {
        if (num%2==0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}
