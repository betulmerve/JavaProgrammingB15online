package day16;

public class CountFrom10To1 {

    public static void main(String[] args) {

        int counter=10;

        while (counter>=1) {

            System.out.println(counter);
            --counter;
        }
        System.out.println("Final value of counter is "+counter);


            //bu da baska bir yol ama ustteki daha anlasilir
//        while (counter!=0) {
//            System.out.println(counter);
//            --counter;
//        }


    }
}
