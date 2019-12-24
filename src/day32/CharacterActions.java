package day32;

public class CharacterActions {

    public static void main(String[] args) {

        /*
        printAtoZ
        create a method that has no parameter
        and print A-Z in one line
         */
        printAtoZ();
        printZtoA();
    }

    public static void printAtoZ() {

        for (char x = 'A'; x <='Z' ; x++) {

            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static void printZtoA() {

        for (char x = 'Z'; x>='A' ; x--) {

            System.out.print(x+ " ");

        }
        System.out.println();
    }
}
