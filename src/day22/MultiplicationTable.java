package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Multiplication table of "+ i);

            for (int j = 1; j <=12 ; j++) {

                System.out.println(i+" * "+j+" = "+(i*j));

            }

        }
    }
}
