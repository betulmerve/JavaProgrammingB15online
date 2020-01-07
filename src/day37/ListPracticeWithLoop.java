package day37;

import java.util.ArrayList;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        /*
         * Create an ArrayList of Integer and fill it up with 1-100
         * */


        ArrayList<Integer> numbers=new ArrayList<>();

        for (int x = 1; x <= 100; x++) {

            numbers.add(x);
        }

        System.out.println("numbers = " + numbers);


        for (int t = 0; t < numbers.size(); t++) {

            if (numbers.get(t)%2==1) {
                numbers.set(t,0);
            }

        }

        System.out.println("numbers = " + numbers);

        //how to find index of 20:

        System.out.println("index of 20 is "+ numbers.indexOf(20));

        //insert 100 to first index

        numbers.add(0,100);


        System.out.println("after inserting index of 20 is "+ numbers.indexOf(20));

    }
}
