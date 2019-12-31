package myfolder;

import java.util.Scanner;

public class Replit_160 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (int x = 0; x < words.length; x++) {

            int count=0;
            for (int y = 0; y < words.length; y++) {

                if (words[x].equals(words[y])) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(words[x]);
            }

        }

    }
}
