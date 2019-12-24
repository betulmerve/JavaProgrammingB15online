package day27;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ExcelTask2DVersion {

    public static void main(String[] args) {

        /*
        Excel Task 2D Array Version:
        You have Excel sheet with 6 rows and 4 columns
        and it contains below data:
        First store those data in 2 dimensional array
        then write a logic to print out in below format.
        Below output is expected from your program:
        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34

        Additional Task on this :
        1, Write a program to ask user row and column number and return the value in that cell. if it's invalid row or column number , it should print invalid input.
        for example : row 1 and column 4 has 84
        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
        Optionally : keep asking user until the user input row and column are not out of range.
        2, Write a program to search a value in excel and print the all location of the value :
        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)
        3, Write a program to ask user for column number and print only that column data :
        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33
         */

        int[] row1={78,54,100,84};
        int[] row2={33,44,77,123};
        int[] row3={12,88,52,76};
        int[] row4={67,33,98,67};
        int[] row5={12,88,52,45};
        int[] row6={67,33,98,34};

        int[][] sheet={row1,row2,row3,row4,row5,row6};



        for (int i = 0; i <6 ; i++) {

            for (int j = 0; j <4 ; j++) {

                System.out.print("Cell("+(i+1)+","+(j+1)+")="+sheet[i][j]+" ");

            }

            System.out.println();

        }

          Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a row and column: ");
//        int row=scan.nextInt();
//        int column=scan.nextInt();
//
//
//            while (!(row>0 && row<7 && column>0 && column<5)) {
//
//                System.out.println("Row "+row+" and column "+column+" ---->INVALID! There are only 6 row and 4 columns");
//                System.out.println("Try again");
//                System.out.println("Please enter a row and column: ");
//                row=scan.nextInt();
//                column=scan.nextInt();
//
//                if (row>0 && row<7 && column>0 && column<5) {
//
//                    System.out.println("Row "+row+" and column "+column+" has "+sheet[row-1][column-1]);
//
//                }
//
//            }


//            int value=67;
//
//        for (int i = 0; i <6 ; i++) {
//
//            for (int j = 0; j <4 ; j++) {
//
//                if (sheet[i][j]==value) {
//                    System.out.print("Cell("+(i+1)+","+(j+1)+") ");
//                }
//            }
//        }

        System.out.println("Please enter a column number: ");
        int columnNumber=scan.nextInt();

        System.out.println();


        for (int i = 0; i <6 ; i++) {

            System.out.print(sheet[i][columnNumber-1]+",");

        }





    }
}
