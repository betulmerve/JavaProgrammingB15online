package day33;

import java.util.Arrays;

public class TaskFromMuhtar {
    public static void main(String[] args) {
        /*
        1. write a method that can convert km to miles
	 				Hint: 1 km = 0.612 miles
	 	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L
	 	3. write a method that can print out the array in Descending order
	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator
		5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
					if score is 79 ~ 70 ==> C
					if score is 69 ~ 60 ==> D
					if score is 0 ~ 59 ==> F
					otherwise ==> Invalid Score
         */

        System.out.println(kmToMilesConverter(10));
        System.out.println(gallonsToLtConverter(5));
        descendingOrderArrayPrinter(new int[] {1,2,3,4,5,6});
        int[] arr2={4,3,7,9,12,6};
        descendingOrderArrayPrinter(arr2);
        calculator(2,3,'*');
        calculator(7,6,'&');
        calculator(1,2,'%');
        calculateGrade(95);
        calculateGrade(102);
        calculateGrade(10);
    }
    public static double kmToMilesConverter(double km) {
        double miles=km*0.612;
        return miles;
    }
    public static double gallonsToLtConverter(double gallon) {
        double litre=gallon*3.75;
        return litre;
    }

    public static void descendingOrderArrayPrinter(int[] arr1) {
        Arrays.sort(arr1);
        for (int x = arr1.length-1; x >=0 ; x--) {
            System.out.print(arr1[x]+" ");

        }
        System.out.println();

    }
    public static void calculator(int num1,int num2, char opt) {
        switch (opt) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid operator!");
        }

    }
    public static void calculateGrade(int score) {
        if (score<=100 && score>=90) {
            System.out.println("A");
        } else if (score<=89 && score>=80) {
            System.out.println("B");
        } else if (score<=79 && score>=70) {
            System.out.println("C");
        } else if (score<=69 && score>=60) {
            System.out.println("D");
        } else if (score<=59 && score>=0) {
            System.out.println("F");
        } else {
            System.out.println("Invalid score!");
        }
    }

}
