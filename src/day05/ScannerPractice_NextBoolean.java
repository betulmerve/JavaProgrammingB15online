package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Are you recording? ");
        boolean isRecording= input.nextBoolean();

        System.out.println("It is "+isRecording);
    }
}
