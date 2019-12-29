package exercisesFromBook;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your weight in pounds");
        double pound=scan.nextDouble();
        System.out.println("Enter your height in feet followed by a space then additional inches.");
        double feet=scan.nextDouble();
        double inches=scan.nextDouble();

        inches=inches+feet*12;
        double weightInKilogram=pound/2.2;
        double heightInMeter=inches*0.0254;
        double bodyMassIndex=weightInKilogram/(heightInMeter*heightInMeter);

        System.out.println("Your BMI is "+bodyMassIndex);


        if (bodyMassIndex<18.5) {
            System.out.println("Your risk category is Underweight");
        } else if (bodyMassIndex<25) {
            System.out.println("Your risk category is Normal weight");
        } else if (bodyMassIndex<30) {
            System.out.println("Your risk category is Overweight");
        } else {
            System.out.println("Your risk category is Obese");
        }

    }
}
