package day59;


import java.rmi.server.ExportException;

public class ExceptionPractice_2 {
    public static void main(String[] args) {

        // IF YOU HAVE MUTI TRY CATCH BLOCK
        // The most specific type (child type ) should come first
        // the more generic type (super type ) should come last

        System.out.println("The start");
        String str=""; //null

        try {
            System.out.println(str.charAt(0));
        }catch (NullPointerException n) {
            System.out.println("No object here!");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("This is the rest of exceptions");
        }

        System.out.println("The end");
    }
}
