package day58;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Checked exception in next line");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Exception was caught");
        }

        System.out.println("After Thread.sleep");
    }
}
