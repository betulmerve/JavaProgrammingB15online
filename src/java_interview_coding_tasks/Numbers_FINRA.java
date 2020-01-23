package java_interview_coding_tasks;

public class Numbers_FINRA {

    /*
    Write a method which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the
    number and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        finraMethod();
    }

    public static void finraMethod() {
        for (int x = 1; x <= 30; x++) {

            if (x%5==0 && x%3==0 ) {
                System.out.print("FINRA"+ " - ");
            } else if (x%5==0) {
                System.out.print("RA"+ " - ");
            } else if(x%3==0) {
                System.out.print("FIN"+ " - ");
            } else {
                System.out.print(x+ " - ");
            }
        }
    }
}
