package myfolder;

import java.util.Scanner;

public class LetterCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int countOfN=0;
        String prefix=str.substring(0,n);


        for (int i = 0; i <=str.length()-n ; i++) {

            if (str.substring(i,i+n).equals(prefix)) {
                countOfN++;
            }
        }
        //System.out.println(countOfN);

        if(countOfN>1) {
            System.out.println(true);
            System.out.println(prefix+" appears twice");
        } else {
            System.out.println(false);
            System.out.println(prefix+" appears once only");
        }




        /*
        Example:
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
         */



        
        


    }
}
