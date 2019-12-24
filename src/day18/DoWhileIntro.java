package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        //cok kullanilmiyor sadece specific durumlarda

//        do {
//            take some action here and repeat it
//        } while (some condition is true)

        //count from 1 to 5

        int x=1;

        do {
            System.out.println(x);
            ++x;
        } while (x<6) ;  // en buyuk fark! sonunda semi colon var!

        //count from 5 to 1

        int y=5;

        do {
            System.out.println(y);
            --y;
        } while (y>=1) ;

        // while loop VS do while loop
        /*
        while loop checks the condition first then enter the statement
        do while loop will take the action at least once then check the condition statment
        do while loop always run at least one iteration!!!

         */


        // {} curly braces
        // [] square bracket
        // () parenthesis
        // ; semi colon
        // : colon
        // ! exclamation mark
        // || pipe
        // & ampersand
        // / forward slash
        // \ backslash
        // " double quote
        // ' single quote



    }
}
