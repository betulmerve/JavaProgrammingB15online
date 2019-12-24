package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has its own ascii value from ascii table

        System.out.println('A' < 'B');  //true


        for(char iChar='A'; iChar<='Z'; iChar++) {
            System.out.print(iChar+" ");
        }

        System.out.println();

        for(char xChar='Z'; xChar>='A'; xChar--) {
            System.out.print(xChar+" ");
        }

        System.out.println();


        char myChar='A';

        for (int i = 0; i <=25 ; i++) {
            System.out.print(myChar++ +" ");

        }

        System.out.println();

        char herChar='Z';

        for (int i = 0; i <=25 ; i++) {
            System.out.print(herChar-- +" ");

        }












        }

    }

