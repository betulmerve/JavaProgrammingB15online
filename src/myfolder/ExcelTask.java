package myfolder;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExcelTask {

    public static void main(String[] args) {


        /*
                    THIS IS HOW WE READ EXCEL
            Cell(1,1) Cell(1,2) Cell(1,3) Cell(1,4)
            Cell(2,1) Cell(2,2) Cell(2,3) Cell(2,4)
            Cell(3,1) Cell(3,2) Cell(3,3) Cell(3,4)
            Cell(4,1) Cell(4,2) Cell(4,3) Cell(4,4)
            Cell(5,1) Cell(5,2) Cell(5,3) Cell(5,4)
            Cell(6,1) Cell(6,2) Cell(6,3) Cell(6,4)
            ----ACTUAL EXCEL USE A-Z FOR COLUMN----
            Cell(1,A) Cell(1,B) Cell(1,C) Cell(1,D)
            Cell(2,A) Cell(2,B) Cell(2,C) Cell(2,D)
            Cell(3,A) Cell(3,B) Cell(3,C) Cell(3,D)
            Cell(4,A) Cell(4,B) Cell(4,C) Cell(4,D)
            Cell(5,A) Cell(5,B) Cell(5,C) Cell(5,D)
            Cell(6,A) Cell(6,B) Cell(6,C) Cell(6,D)
         */

        System.out.println("THIS IS HOW WE READ EXCEL");
        for (int x = 1; x <7 ; x++) {

            for (int y = 1; y <5 ; y++) {

                System.out.print("Cell("+x+","+y+")"+" ");

            }
            System.out.println();
        }

        System.out.println("----ACTUAL EXCEL USE A-Z FOR COLUMN----");

        for (int x = 1; x <7 ; x++) {

            for (char y = 'A'; y <='D' ; y++) {

                System.out.print("Cell("+x+","+y+")"+" ");

            }
            System.out.println();
        }






    }
}
