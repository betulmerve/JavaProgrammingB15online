package myfolder;

import java.util.Arrays;

public class Replit_171 {

    public static void main(String[] args) {

//        Scanner inp = new Scanner(System.in);
//        int rows = inp.nextInt(), cols = inp.nextInt();
//        int[][] arr = new int[rows][cols];
//        for(int i=0 ;i<=rows-1;i++){
//            for(int j=0 ;j<=cols-1;j++){
//                arr[i][j]=inp.nextInt();
//            }//end for cols
//        }//end for rows

        int[][] arr=new int[][] {{1,2,3},{5,33,9}};
        //TODO write your code

        int max=arr[0][0];
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (arr[x][y]>max) {
                    max=arr[x][y];
                }
            }

        }

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y]=max;
            }
        }

        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }

    }

