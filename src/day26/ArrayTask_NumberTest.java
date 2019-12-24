package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        /*
        // 1, write a program to test all the element in an int array more that 100
         */

        int[] scores={120,150,130,145};

        //create a variable called finalResult to store your result
        //if every number is in array more than 100 or not

        String finalResult=""; //if all numbers are more than 100 then make it yes if not make it no

        //Logic 1:
        // check is it less then 100,count, the end if count is more than 0, answer is no
        // the end if count is

        int count1=0;
        for (int each:scores) {

            if (each<100) {
                count1++;
            }
        }
        if (count1>0) {
            finalResult="no";
        } else {
            finalResult="yes";
        }

        System.out.println("Final result is: "+finalResult);



        //Logic 2:
        //check is it more then 100, count, the end if count is equal to length, answer is yes
        int count=0;
        for (int each:scores) {
            if (each>100) {
                count++;
            }
        }

        if (count==scores.length) {
            finalResult="yes";
        } else {
            finalResult="no";
        }

        System.out.println("Final result is: "+finalResult);

        //Logic 3:
        //check each item and break when number is less than 100 after assigning finalResult to no


        finalResult="yes";

        for (int each:scores) {

            if (each<100) {
                finalResult="no";
                break;
            }

        }

        System.out.println("Final result is: "+finalResult);

        //Logic 4
        //minus 100 from all arrays, if there is a minus value, finalResult is no




    }
}
