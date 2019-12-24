package day22;

public class ArrayPractice {

    public static void main(String[] args) {

        double[] prices=new double[5];

        System.out.println(prices[0]);

        //cant not print out directly like below
        System.out.println(prices);

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;

        //create a char array that hold all the letter from your name
        //and assign a value using each character then print out

        char[] letter=new char[5];

        //what default value do we get for char array?
        //we get a char represented by ascii code 0

        letter[0]='m';
        letter[1]='e';
        letter[2]='r';
        letter[3]='v';
        letter[4]='e';

        System.out.println(letter[0]);
        System.out.println(letter[1]);
        System.out.println(letter[2]);
        System.out.println(letter[3]);
        System.out.println(letter[4]);

        //bu sadece char arrayde ise yariyor!! exclusive for char array
        //anything else it will print out memory adress
        System.out.println(letter);



        boolean[] yesNo=new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=10>7;  //true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);




    }
}
