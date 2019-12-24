package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int score=25;
        if (score<0 || score>100) {
            System.out.println("INVALID SCORE!");
        } else if (score==100) {
            System.out.println("PERFECT SCORE!");
        } else if (score>=70 && score <100) {
            System.out.println("YOU HAVE PASSED!");
        } else if (score>40 && score<70) {
            System.out.println("little bit more study");
        } else if(score>30 && score<40) {
            System.out.println("atten additional class");
        } else if (score<=30) {
            System.out.println("Come to my office");
        } else {
            System.out.println("YOU HAVE FAILED!");
        }
    }
}
