package java_interview_coding_tasks;

public class String_Reverse {

    /*
    Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String str) {
        String reversed="";

        for (int x = str.length()-1; x >=0 ; x--) {

            reversed=reversed+str.charAt(x);

        }

        return reversed;
    }
}
