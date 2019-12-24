package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        // assuming start always less than end
        //slow increase of the speed

        int start;
        int end;
        Scanner scan=new Scanner(System.in);


//        System.out.println("Where do you wanna start?");
//        start=scan.nextInt();
//        System.out.println("Where do you wanna end?");
//        end=scan.nextInt();

//        System.out.println("what is your starting point and ending point?");
//        start=scan.nextInt();
//        end=scan.nextInt();
//
//        for (int i = start; i <=end ; i++) {
//            System.out.print(i+ " ");
//
//        }

        //if start is less then end
        //speed supposed to be increase
        //if start is more then end
        //speed supposed to be decrease


        System.out.println("what is your starting point and ending point?");
        start=scan.nextInt();
        end=scan.nextInt();

        if (start<end) {
            System.out.println("Increasing the speed");
            for (int i = start; i <=end ; i++) {
                System.out.print(i+ " ");
        }

        } else if (start>end) {
            System.out.println("Decreasing the speed");
            for (int i = start; i >end ; i--) {
                System.out.print(i+ " ");
            }

        } else {
            System.out.println("no action needed, same speed!");
        }


    }
}
