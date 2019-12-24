package day19;

import java.util.Scanner;

public class HomeworkWithSum {

    public static void main(String[] args) {

        //create a program to ask user two number
        //and add numbers within those range

        Scanner scan=new Scanner(System.in);
        System.out.println("Number 1 ?");
        int num1=scan.nextInt();
        System.out.println("Number 2 ?");
        int num2=scan.nextInt();
        int sum=0;


        if(num1 < num2) {
            for (int i = num1;  num1<=num2 ; num1++) {
                sum=sum+num1;
            }
        } else if(num1 >num2) {
            for (int i = num1; num1 >=num2 ; num1--) {
                sum=sum+num1;
            }
        } else {
            System.out.println("dont do anything, same num!");
        }

        System.out.println(sum);
    }
}
