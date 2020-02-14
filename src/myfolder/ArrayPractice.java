package myfolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> twoTimes = new ArrayList<>();
        int x = 0;
        for (int i = list.size()-1; i >=0; i--) {
            twoTimes.add(list.get(i));
            twoTimes.add( list.get(i));

        }
        System.out.println(twoTimes);
    }

}
