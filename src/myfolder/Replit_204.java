package myfolder;

import java.util.Arrays;

public class Replit_204 {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "Silent")); // ==> true

        System.out.println(isAnagram("earth", "heart")); //==> true

        System.out.println(isAnagram("star", "rats")); //==> true

        System.out.println(isAnagram("hi", "bye")); //==> false

        System.out.println(isAnagram("java", "cava")); //==> false

    }

    public static boolean isAnagram(String word1, String word2) {

        String[] arr1=word1.toLowerCase().replace(" ","").split("");
        String[] arr2=word2.toLowerCase().replace(" ","").split("");

        if (word1.length()!=word2.length()) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            return true;
        } else {
            return false;
        }
    }
}
