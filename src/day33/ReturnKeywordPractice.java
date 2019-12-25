package day33;

public class ReturnKeywordPractice {
    public static void main(String[] args) {

        //write a method that accept birth year and convert it to age
        //birth year should be with in the range of 1900-2020
        // if not return 0

        /*
        calculateAndReturnAge
        optionally : test your code against array of birthYears
        {1999,122,2019, 1987, 1978,1964,3999, 2004}
         */

        System.out.println(calculateAndReturnAge(1989));
        System.out.println(calculateAndReturnAge(2030));

        int[] birthYears={1999,122,2019, 1987, 1978,1964,3999, 2004};

        for (int eachBirthYear:birthYears) {
            System.out.println(calculateAndReturnAge(eachBirthYear));
        }

    }

    public static int calculateAndReturnAge(int birthYear) {

        if (birthYear>1900 && birthYear<2020) {
            int age=2019-birthYear;
            return age;

        } else {
            return 0;
        }
    }
}
