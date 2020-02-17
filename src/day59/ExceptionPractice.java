package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The start");
        String name="Furkan";

        Scanner scan=new Scanner(System.in);
        System.out.println("Character at what index do you want to get from Furkan's name ");


        try{
            int targetIndex=scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("end of try");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You are out of bound!");
            System.out.println("Message from getMessage method : "+e.getMessage());
        } catch (InputMismatchException e2) {
            System.out.println("Input mismatch, enter number!");
            System.out.println("Here is what you get if you enter 0 "+ name.charAt(0));

        }

        System.out.println("The end");








    }
}
