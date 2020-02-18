package day60.exceptions;

public class BreakTimeExceptions extends RuntimeException {

}

class Main{
    public static void main(String[] args) {

        //throw new BreakTimeExceptions();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("Wola!My own checked exception!");
        }



    }


}
