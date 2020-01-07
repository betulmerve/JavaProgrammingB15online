package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);

        //bu index i remove ediyor
        lst.remove(3);
        System.out.println("lst = " + lst);
        lst.remove(2);
        System.out.println("lst = " + lst);

        //bu value remove ediyor
        //lst.remove(new Integer(2));
        lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);

    }
}
