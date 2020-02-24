package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//bunu unutma! MAP is not iterable!!

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<String> allnames=groceryPriceMap.keySet();

        for (String each:allnames) {
            System.out.println("each = " + each+
                    " | value is "+groceryPriceMap.get(each));
        }
    }
}
