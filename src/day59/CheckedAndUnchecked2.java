package day59;

public class CheckedAndUnchecked2 {

    // checked exception must be handled or declared

    // handle -->> try catch
    // declare -->> add it to the method signature to document
    public static void main(String[] args) throws InterruptedException {

        String x="abc";
        System.out.println("START");

        Thread.sleep(1000);

        System.out.println("End");

    }
}
