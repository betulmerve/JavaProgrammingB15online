package exercisesFromBook;

public class Quiz {

    static int a = 55;

    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        System.out.println(quiz.a);

        Quiz quiz1 = new Quiz();
        quiz1.a = 100;
        System.out.println(quiz1.a);


        Quiz quiz2 = new Quiz();

        System.out.println(quiz2.a);

    }
}
