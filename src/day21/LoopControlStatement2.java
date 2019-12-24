package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {

        //continue
        //loop will skip to next iteration

        //we can use break and continue for any type of loop


        //eger tek sayi ise atla, cift ise bas
        for (int x = 1; x <=10 ; x++) {

            if(x%2==1) {
                continue;  //mean skip dont forget!
            }

            System.out.println(x);
            
        }
    }
}
