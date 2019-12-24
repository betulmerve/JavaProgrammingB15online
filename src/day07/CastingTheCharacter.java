package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade='B' ;
        System.out.println(grade);



        int letterInNumber = 'B' ;
        System.out.println(letterInNumber);
        // B is represented by 66 in ASCII table
        // type char is automatically widened to int
        // and stored as a number


        char myFirstChar= 100;
        System.out.println(myFirstChar);
        // d is represented by 100 in ASCII table


        char letterA ='a';
        // adding a character to a int number will result in int
        // (int) letterA +1
        System.out.println(letterA+1);
        // we start with String, if you add smth to String it will become String
        //  a1
        System.out.println(" "+letterA+1);









    }
}
