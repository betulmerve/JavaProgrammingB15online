package day21;

public class SkipAll5S {
    public static void main(String[] args) {

        //skip all the numbers divisible by 5

        for (int x = 1; x <=100 ; x++) {

            if(x%5==0) {
                System.out.println("Skipping "+x);
                continue;
            }

            System.out.println(x);
        }

            //bu da ayni sonucu veriyor
//        for (int x = 1; x <=100 ; x++) {
//
//            if(x%5!=0) {
//                System.out.println(x);
//            } else {
//                System.out.println("Skipping "+x);
//            }
//        }
    }
}
