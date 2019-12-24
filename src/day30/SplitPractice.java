package day30;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        //bu sekilde boluyoruz fakat
        //modelin IS oldugunu soyluyor
        //aslinda model IS-F bunun icinde yeni bir split method
        //neyle kesecegimizi ve kac parcaya bolecegimizi soyluyoruz

        String car="Lexus-IS-F";
        String[] carSplitted=car.split("-",2);  //boylece ilk - gordugu yerden bizim dedigimiz gibi 2 parcaya boluyor
        System.out.println(Arrays.toString(carSplitted));

        String model=carSplitted[1];
        System.out.println("model = " + model);

        //but actual model is IS-F

    }
}
