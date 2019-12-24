package day18;

public class ForLoopIntro {

    public static void main(String[] args) {

        //count 1 to 5

        // for loop has 3 parts
        // first part: initialization
            // it will run only once when u enter the loop
        // second part: termination condition
            //loop will stop if it is false
            //it will be checked every time
        // third part: increment or decrement to change condition eventually
            //it will run after each iteration
        //son kisim onemli karistirma! ilk girdiye bakiyor sarti sagliyorsa loop icine giriyor
        //sonra increment ya da decrement yapiyor
        //sasirma!

        for (int i=1; i<6 ; ++i) {
            System.out.println("i= "+i);
            System.out.println("Happy Birthday!");
        }


        for (int x=10; x>0; --x ) {
            System.out.println(x);
        }
    }
}
