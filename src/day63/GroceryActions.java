package day63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroceryActions {
    public static void main(String[] args) {

        Map<String ,Double> groceryMap=new HashMap<>();
        groceryMap.put("apple",2.99);
        groceryMap.put("pear",1.99);
        groceryMap.put("grape",4.99);
        groceryMap.put("banana",7.99);
        groceryMap.put("avocado",6.99);
        groceryMap.put("strawberry",3.99);
        groceryMap.put("orange",4.99);
        groceryMap.put("grape",2.99);
        groceryMap.put("avocado",9.99);
        groceryMap.putIfAbsent("grape",3.99);

        System.out.println("groceryMap = " + groceryMap);
        System.out.println("groceryMap.get(\"grape\") = " + groceryMap.get("grape"));

        //double the price of apple
        groceryMap.replace("apple",groceryMap.get("apple")*2);
//        double newPrice=groceryMap.get("apple")*2;
//        groceryMap.replace("apple",newPrice);
        //reduce banana price by 1$
        groceryMap.replace("banana",groceryMap.get("banana")-1);


        if (groceryMap.containsKey("orange")) {
            groceryMap.remove("orange");
            System.out.println("no more orange!");
        }


        System.out.println("groceryMap = " + groceryMap);

    }
}
