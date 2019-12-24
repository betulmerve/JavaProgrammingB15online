package day28;

import java.util.Arrays;

public class ExcelVisualizer {

    public static void main(String[] args) {

        /*
        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34

         */

        int[] row1=new int[]{78,54,100,84};
        int[] row2=new int[]{33,44,77,123};
        int[] row3=new int[]{12,88,52,76};
        int[] row4=new int[]{67,33,98,67};
        int[] row5=new int[]{12,88,52,45};
        int[] row6=new int[]{67,33,98,34};


        //to store this in another array object

        int[][] sheet={row1,row2,row3,row4,row5,row6};
        System.out.println(Arrays.deepToString(sheet));


        for (int i = 1; i <7 ; i++) {
            for (int j = 1; j <5 ; j++) {

                System.out.print("Cell("+i+","+j+")="+sheet[i-1][j-1]+" ");

            }
            System.out.println();

        }
    }
}
