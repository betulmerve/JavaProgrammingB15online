package day17;

public class OnlyOddNumber {

    public static void main(String[] args) {

        int num=100;

        while (num>0) {
            if(num%2==1) {  //num%2!=0 da diyebiliriz
                System.out.println(num +" is odd number");
            }
            --num;
        }
    }
}
