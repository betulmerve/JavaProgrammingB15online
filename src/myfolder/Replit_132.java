package myfolder;

import java.util.Scanner;

public class Replit_132 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];


        for (int x = 0; x <7 ; x++) {
            System.out.println("Enter score for judge "+(x+1)+":");
            score[x]=input.nextInt();

        }

        System.out.println("Enter difficulty:");
        float diff=input.nextFloat();

        float max=score[0];
        float min=score[0];

        for (int i = 0; i < score.length; i++) {

            if (score[i]>max) {
                max=score[i];
            }

            if (score[i]<min){
                min=score[i];
            }

        }

        float sum=0;

        for (float each:score) {

            if (each==max || each==min) {
                continue;
            } else {
                sum=sum+each;
            }

        }

        sum=sum*diff;

        double total=sum*0.6;











        System.out.printf("Total: %.2f", total);

    }
}
