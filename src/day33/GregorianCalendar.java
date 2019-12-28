package day33;

public class GregorianCalendar {

    public static void main(String[] args) {

        /*
        In the Gregorian calendar three criteria must be taken into account to identify leap years:
        The year can be evenly divided by 4;
        If the year can be evenly divided by 100, it is NOT a leap year, unless;
        The year is also evenly divisible by 400.  Then it is a leap year.
        Write a method
        public static boolean isLeapYear(int year){
        //TODO Your codes here
                return false; //return correct result
        }
         */

        System.out.println(isLeapYear(2000));
    }


    public static boolean isLeapYear(int year) {

        boolean calendar=false;
        if (year%100==0 && year%400!=0) {
            calendar=false;
        } else if (year%4==0)  {
            calendar=true;
        } else if (year%400==0 && year%100==0) {
            calendar=true;
        }

        return calendar;

    }

}
