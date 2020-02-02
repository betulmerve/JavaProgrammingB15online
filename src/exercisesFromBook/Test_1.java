package exercisesFromBook;

public class Test_1 {

    int iNumber = 10;

    public static void main(String[] args) {
        Test_1 t1 = new Test_1();
        t1.iNumber = 20;
        System.out.println(t1.iNumber);

        Test_1 t2 = new Test_1();
        System.out.println(t2.iNumber);
    }
}
