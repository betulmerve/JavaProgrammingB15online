package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_162 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);

    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] arr=new int[100];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;

        for (int x = 2; x < arr.length; x++) {
            arr[x]=arr[x-1]+arr[x-2];
        }

        System.out.println(arr[num-1]);
    }




}
