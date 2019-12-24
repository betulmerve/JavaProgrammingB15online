package day05;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("What is the temperature in F? ");

        double fahrenheit=input.nextDouble();

        double celcius=(fahrenheit-32)*5/9;

        System.out.println("The weather is "+celcius+" in C.");

    }
}
