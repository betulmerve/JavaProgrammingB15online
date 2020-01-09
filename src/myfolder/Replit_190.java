package myfolder;

import java.util.Arrays;

public class Replit_190 {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(mergR(new int[]{1,2,3}, new int[]{4, 5})));
    }

    public static int[] mergR(int[] a,int[] b) {

        int[] merged=new int[a.length+b.length];

        for (int x = 0; x < a.length; x++) {
            merged[x]=a[x];

        }

        int num=0;
        for (int y = a.length; y < merged.length; y++) {
            merged[y]=b[num];
            num++;
        }

        return merged;

    }
}
