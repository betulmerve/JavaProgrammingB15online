package myfolder;

public class Replit_188 {

    public static void main(String[] args) {


    }

    public static int findMax(int[] arr1) {
        int max=arr1[0];
        for (int x = 0; x < arr1.length; x++) {
            if (arr1[x]>max) {
                max=arr1[x];
            }

        }
        return max;

    }

    public static double findMax(double[] arr2) {
        double max=arr2[0];
        for (int y = 0; y < arr2.length; y++) {
            if (arr2[y]>max) {
                max=arr2[y];
            }

        }
        return max;

    }
}
