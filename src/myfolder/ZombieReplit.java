package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieReplit {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }

       int[] inhabitants={3,6,0,4,3,2,7,0};

       int[] newArr=new int[inhabitants.length];
       int[] testArr={0,0,0,0,0,0,0,0};

       int day=0;

       do {
           System.out.println("Day "+day+ " "+ Arrays.toString(inhabitants));

           for (int i = 0; i < newArr.length; i++) {
               newArr[i]=inhabitants[i];
           }

           for (int x = 0; x < newArr.length; x++) {

               if (x==0 && inhabitants[0]==0) {
                   inhabitants[1]=newArr[1]/2;
               } else if (x==7 && inhabitants[7]==0) {
                   inhabitants[6]=newArr[6]/2;
               } else if (inhabitants[x]==0) {
                   inhabitants[x-1]=newArr[x-1]/2;
                   inhabitants[x+1]=newArr[x+1]/2;
               }
           }
           day++;

       } while (!Arrays.equals(inhabitants,testArr));

        System.out.println("Day "+day +" "+Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}

//        int day=0;
//        int temp[]=new int[8];
//        int zeros[]={0, 0, 0, 0, 0, 0, 0, 0};
//
//        do{
//            System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
//            for (int i = 0; i <temp.length ; i++) {
//                temp[i]=inhabitants[i];
//            }
//            for (int i = 0; i <inhabitants.length ; i++) {
//                if (i==0&&temp[0]==0){
//                    inhabitants[1]=temp[1]/2;
//                } else if(i==inhabitants.length-1&&temp[inhabitants.length-1]==0){
//                    inhabitants[i-1]=temp[i-1]/2;
//                } else if(temp[i]==0){
//                    inhabitants[i-1]=temp[i-1]/2;
//                    inhabitants[i+1]=temp[i+1]/2;
//                }
//            }day++;
//        }while(!Arrays.equals(inhabitants,zeros));
//
//        System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
//
//        System.out.println("---- EXTINCT ----");
//
//    }
//}
