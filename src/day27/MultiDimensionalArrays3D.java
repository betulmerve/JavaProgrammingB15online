package day27;

import java.util.Arrays;

public class MultiDimensionalArrays3D {

    public static void main(String[] args) {

        //N dimensional array MUST contain (N-1) dimensional arrays

        //2D array: contains 1 dimensional array
        int [][] arr2D={ {1,2,3},{4,5,6}  };
        //                  0        1

        //3D array: contains 2D array

        int [][][] arr3D={  { {1,2,3},{4,5,6}  } , { {7,8,9},{10,11,12}  }    };
        //                           0                        1

        //first [] is index num of 2D array
        //second [] is index num of 1D array
        //third [] is index num of element

        System.out.println(arr3D[0][1][0]);  //4
        System.out.println(arr3D[1][0][2]);  //9
        System.out.println(arr3D[0][0][1]); //2

        //print {1,2,3}

        System.out.println(Arrays.toString(arr3D[0][0]));

        //print {10,11,12}

        System.out.println(Arrays.toString(arr3D[1][1]));

        //print {7,8,9},{10,11,12}

        System.out.println(Arrays.deepToString(arr3D[1]));

        //entire 3D array

        System.out.println(Arrays.deepToString(arr3D));

        //for loop

        for (int i = 0; i < arr3D.length; i++) {

            for (int j = 0; j < arr3D[i].length; j++) {

                for (int k = 0; k < arr3D[i][j].length; k++) {

                    System.out.print(arr3D[i][j][k]+" ");

                }

            }

        }

        System.out.println("\n=======================");

        //for each loop

        for (int[][] each2Darray:arr3D) {
            for (int[] each1Darray:each2Darray) {
                for (int eachElement:each1Darray) {

                    System.out.print(eachElement+" ");

                }

            }

        }







    }
}
