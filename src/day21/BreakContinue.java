package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=5 ; x++) {

            System.out.println(x);

            if(x==5) {
                break;  //this is pointless
            }

            continue; //this is also pointless
            
        }
    }
}
