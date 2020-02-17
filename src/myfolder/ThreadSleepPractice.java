package myfolder;

public class ThreadSleepPractice {

    public static void main(String[] args) {

        try{

            for (int x = 0; x < 10; x++) {

                System.out.println(x);
                Thread.sleep(1000);

            }
        }catch (Exception e) {
            System.out.println("Exception!");
        }

    }

}
