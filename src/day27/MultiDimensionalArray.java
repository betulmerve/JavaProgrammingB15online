package day27;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        /*
        Single dimensional array:contains values

        int[] arr={1,2,3};

        Multidimensional array: an Array that can contain another Array or Arrays
                                N-dimensional array contains (N-1) dimensional arrays

         */

        int[] arr1D={1,2,3};

        //2D array: is an array that contain single dimensional array based on formula above

        int[][]arr2D={ {1,2,3}, {4,5,6}  };

        //single arrayde [] bize index num of element veriyordu
        //multidimensional arrayde iki [] var
        //ilki [] icindeki array in indexi
        // arr2D[0]={1,2,3}
        //ikinci [] ise arrayin icindeki value nun indexi
        // [INDEX OF 1D ARRAY][INDEX OF ELEMENTS IN ARRAY]

        System.out.println(arr2D[1][2]);  //6

        //Arrays.toString is only applicable for single arrays
        //Arrays.deepToString(multi-D arrays)

        System.out.println(Arrays.deepToString(arr2D));






    }
}
