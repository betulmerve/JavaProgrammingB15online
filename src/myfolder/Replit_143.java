package myfolder;

import java.util.Arrays;

public class Replit_143 {

    public static void main(String[] args) {

        int[][] multiplicationTable = new int[10][10];

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {

                multiplicationTable[x][y]=(x+1)*(y+1);

            }

        }

        System.out.println(Arrays.deepToString(multiplicationTable) ) ;





    }
}
