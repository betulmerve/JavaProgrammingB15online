package day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {

        /*
        convertNumberToDay
        This method will take number from 1-7
        and convert that to actual day in word
         */
        System.out.println(convertNumberToDay(2));
        System.out.println(convertNumberToDay(8));
        System.out.println(convertNumberToDay(4));


        int[] allCodes={5,3,11,4,33};
        //for loop version
        for (int x = 0; x <allCodes.length ; x++) {
            String day=convertNumberToDay(allCodes[x]);
            System.out.println("day is "+ day);
        }
        System.out.println("----------");
        //for each loop version
        for (int eachCode:allCodes) {
            System.out.println("each day = " + convertNumberToDay(eachCode));

        }
    }

    public static String convertNumberToDay(int dayCode) {


        String day="";
        switch (dayCode) {
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            //bunlar yerine soyle de yapabilirsin
            // direkt sunu yazarsin
            //return "Sunday";
            //boyle olursa break yazmaya da gerek yok
            default:
                day="FUNDAY!";

        }
        return day;

    }
}
