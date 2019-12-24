package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla=new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name=blabla.nextLine();
        System.out.println("You entered "+name);

        System.out.println("What is your age ? ");
        int age=blabla.nextInt();
        System.out.println("You entered "+age);
        blabla.nextLine(); //bu kurtaricimiz, aciklamasi altta

        System.out.println("What is your address ? ");
        String address=blabla.nextLine();
        System.out.println("You entered "+address);

        //boyle olunca hata veriyor, cunku nextInt olarak dedigimiz
        // yasi girdikten sonraki enteri algilamiyor o enteri
        // nextLine olan algiliyor kod bitiyor
        //o yuzden araya blabla.nextLine() ekliyoruz ki o enteri
        // algilasin diger kodu etkilemesin






    }
}
