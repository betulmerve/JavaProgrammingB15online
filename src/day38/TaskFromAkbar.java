package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbar {


    public static void main(String[] args) {

        ArrayList<String> score=new ArrayList<>();
        score.add("79");
        score.add("54");
        score.add("100");
        score.add("65");
        score.add("44");

        isScorePass(score);
        countMoreThan90(score);
        System.out.println("Average score is :" +averageScore(score));
        System.out.println("Score- Value paired result is: "+scoreGradePair(score));

        String str="abcdefgh";
        System.out.println(converter(str));
//
        String str2="123456";
        System.out.println(isNumberOnly(str2));
        System.out.println(isNumberOnly(str));

        List<String> lst1=new ArrayList<>();
        lst1.add("123");
        lst1.add("44");
        lst1.add("55");
        lst1.add("12345");
        lst1.add("abc");
        System.out.println(isNumberList(lst1));


        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);

        reverseList(nums);

        List<String> names=new ArrayList<>();
        names.add("Merve");
        names.add("Ali");
        names.add("BetulMerveFakiCakir");

        checkCharacterCount(names);
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);

        insertingItems(numbers);




    }

    /*
    TASK1
    Given a ArrayList of 6 Integer 1,3,7,2,12,7
    insert 100 in between each numbers
    For example :
    1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7

    Optionally make it a method
    write a static void method that accept a ArrayList of integer object and insert 100 in between items.

    */

    public static void insertingItems(ArrayList<Integer> nums) {
        for (int x = 0; x <nums.size() ; x=x+2) {
            nums.add(x+1,100);

        }
        System.out.println(nums);

    }

    /*
        TASK2
    Given List of names with various character count,
    Remove any name with less than 2 characters
    and if any name has more than 10 character only keep 10 characters
    and if it has exactly 5 characters , reverse it
    Of course , Optionally make a method out of it.
     */

    public static void checkCharacterCount(List<String> names) {
        for (int x = 0; x < names.size(); x++) {
            if (names.get(x).length()<2) {
                names.remove(x);
                x--;
            } else if(names.get(x).length()>10) {
                names.set(x,names.get(x).substring(0,10));
            } else if(names.get(x).length()==5) {
                String str=names.get(x);
                String newStr="";
                for (int i = str.length()-1; i >= 0; i--) {
                    newStr=newStr+str.charAt(i);
                }
                names.set(x,newStr);
            }

        }
        System.out.println(names);
    }

    /*
      TASK3
    Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
    * print pass if its more than 60 fail if not
    * count how many score are more than 90
    * get the average score
    * update the values with score-grade pair
      for example
    79C , 54F, 100A, 65D, 44F , 89B , 95A
    Optionally create 4 methods according to above criteria
     */

    public static void isScorePass (ArrayList<String> scores) {

        for (int x = 0; x < scores.size(); x++) {

            if (Integer.parseInt(scores.get(x))>60) {
                System.out.println(scores.get(x)+" is passed");
            } else {
                System.out.println(scores.get(x)+" is failed");
            }
        }
    }

    public static void countMoreThan90 (ArrayList<String> scores) {
        int count=0;
        for (int y = 0; y < scores.size(); y++) {

            if (Integer.parseInt(scores.get(y))>90) {
                count++;
            }

        }
        System.out.println(count+" scores are more than 90");
    }

    public static double averageScore (ArrayList<String> scores) {
        double sum=0;

        for (int i = 0; i < scores.size(); i++) {

            sum=sum+Integer.valueOf(scores.get(i));

        }

        return sum/scores.size();
    }

    public static ArrayList<String> scoreGradePair(ArrayList<String> scores) {

        for (int x = 0; x < scores.size(); x++) {

            if (Integer.valueOf(scores.get(x))>90) {
                scores.set(x,scores.get(x)+"A");
            } else if(Integer.valueOf(scores.get(x))>80) {
                scores.set(x,scores.get(x)+"B");
            } else if (Integer.valueOf(scores.get(x))>70) {
                scores.set(x,scores.get(x)+"C");
            } else if (Integer.valueOf(scores.get(x))>60) {
                scores.set(x,scores.get(x)+"D");
            } else {
                scores.set(x,scores.get(x)+"F");
            }

        }
        return scores;
    }

    /*
    TASK4
    Create a method that accept String object and return List<Character> that contains each character.
     */
    public static List<Character> converter(String obj) {
        List<Character> chars=new ArrayList<>();

        for (int x = 0; x < obj.length(); x++) {

            chars.add(obj.charAt(x));

        }

        return chars;
    }
    /*
        TASK5
    Create a method called isNumberOnly and it accept a String object
    and return true if all of its characters are number.

    Create another method isNumberList , it accepts
    List<String> object and return true only if all items are number only (use above method)
     */

    public static boolean isNumberOnly(String str) {
        boolean result=true;

        for (int x = 0; x < str.length(); x++) {

            if (!Character.isDigit(str.charAt(x))) {
                result=false;
            }

        }
        return result;

    }
    public static boolean isNumberList(List<String> lst) {

        boolean result=true;
        for (int x = 0; x < lst.size(); x++) {

            result=isNumberOnly(lst.get(x));

        }
        return result;
    }
           /*
    TASK6
    Write a static void method to accept a List<Integer> and reverse it
    (Do not create new List, use swamp logic)
     */

    public static void reverseList(List<Integer> nums) {

        Integer temp;

        for (int x = 0; x < nums.size()/2; x++) {

            temp=nums.get(x);
            nums.set(x,nums.get(nums.size()-(x+1)));
            nums.set(nums.size()-(x+1),temp);
        }
        System.out.println(nums);

    }




}



