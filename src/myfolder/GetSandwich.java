package myfolder;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count=0;
        int firstBreadIndex=0;
        int secondBreadIndex=0;



        for (int i = 0; i <=str.length()-5 ; i++) {
            if (str.substring(i,i+5).equals("bread")) {
                firstBreadIndex=i;
                break;
            }
        }

        for (int i = str.length()-5; i >=0 ; i--) {
            if (str.substring(i,i+5).equals("bread")) {
                secondBreadIndex=i;
                break;
            }
        }

        for (int i = 0; i <=str.length()-5 ; i++) {
            if (str.substring(i,i+5).equals("bread")) {
                count++;
            }
        }

        if(count<2) {
            System.out.println("nothing");
        } else {
            System.out.println(str.substring(firstBreadIndex+5,secondBreadIndex));
        }

        //bu yontem tabi ki daha kolay :)))

//        int first = str.indexOf("bread");
//        int last = str.lastIndexOf("bread");
//        if (first != last) {
//            System.out.println(str.substring(first+5, last));
//        }
//        else {
//            System.out.println("nothing");
//        }

    }
}
