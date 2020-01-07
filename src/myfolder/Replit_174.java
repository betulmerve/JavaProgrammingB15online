package myfolder;

import java.util.Scanner;

public class Replit_174 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i=0; i < size; i++){
//            nums[i] = scan.nextInt();
//        }
//        printUniqueNumbers(nums);

        System.out.println(simpleRoomBook(false,2,1,2018));
        System.out.println(simpleRoomBook(true,2,1,2018));
        System.out.println(simpleRoomBook(true,7,2,2018));
        System.out.println(mergeStrings("wooden","spoon"));
        System.out.println(uniqueChars("mama"));
        System.out.println(wordCount("foo boo"));
        System.out.println(wordCount("bla"));
        System.out.println(wordCount("one two three"));
        System.out.println(clean("he said bla bla bla", "bla"));
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int x = 0; x < nums.length; x++) {
            int count=0;
            for (int y = 0; y < nums.length; y++) {
                if (nums[x]==nums[y]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(nums[x]);
            }

        }
    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if(!isAvailable || year!=2018) {
            return false;
        } else if(month==7) {
            if(day==1 || day==2 || day==3 || day==4 || day==5 ||day==6 || day==7|| day==8) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static String mergeStrings(String one, String two) {

        String newWord="";
        if (one.length()==two.length()) {
            for (int x = 0; x < one.length(); x++) {
                newWord=newWord+one.charAt(x)+two.charAt(x);
            }
        } else if (one.length()>two.length()) {
            for (int y = 0; y < two.length(); y++) {
                newWord=newWord+one.charAt(y)+two.charAt(y);
            }
            newWord=newWord+one.substring(two.length());
        } else if (two.length()>one.length()) {
            for (int z = 0; z < one.length(); z++) {
                newWord=newWord+one.charAt(z)+two.charAt(z);
            }
            newWord=newWord+two.substring(one.length());
        }

        return newWord;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String word="";
        for (int x = 0; x < str.length(); x++) {
            if (!str.substring(0,x).contains(""+str.charAt(x))) {
                word=word+str.charAt(x);
            }

        }
        return word;
    }

    public static int wordCount(String words) {

        int count=0;

        for (int x = 0; x < words.length(); x++) {

            if (words.charAt(x)==' ') {
                count++;
            }

        }

        return count+1;

    }

    /*
    clean ("one two three","two")
    returns "one three"

    clean ("foo bar","foo")
    returns "bar"

    clean ("he said bla bla bla","bla")
    returns "he said "
     */
    public static String clean (String text ,String badWord) {



        String clean=text.replace(badWord,"");

        return clean;



    }
}
