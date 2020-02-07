package day54.interface_as_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility2 {

    public static void main(String[] args) {

        Wearable w1=new Watch();
        Wearable w2=new Perfume();
        Wearable w3=new Clothes();
        Wearable w4=new Makeups();

        List<Wearable> wearableList= Arrays.asList(w1,w2,w3,w4);

        for (Wearable each:wearableList) {

            each.wear();

        }

        System.out.println("================");

        Wearable[] arr={w1,w2,w3,w4};

        for (Wearable each:arr) {

            each.wear();

        }


    }
}
