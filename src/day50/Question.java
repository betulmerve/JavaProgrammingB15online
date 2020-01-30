package day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";

    public abstract void calculate();

    public Question() {

    }
    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "The question type is " + questionType +" : " ;
    }
}
