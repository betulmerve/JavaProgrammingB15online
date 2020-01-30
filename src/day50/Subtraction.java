package day50;

public class Subtraction extends Question {


    public Subtraction(int num1, int num2) {
        super("-", "subtraction");
        if (num1>num2) {
            this.num1=num1;
            this.num2=num2;
        } else {
            this.num1=num2;
            this.num2=num1;
        }


    }

    @Override
    public void calculate() {

        answer=num1-num2;
        calculated=true;
    }

    @Override
    public String toString() {
        if(calculated) {
            return super.toString()+ num1 + operator +  num2 +" = " + answer;
        } else {
            return super.toString()+ num1 + operator +  num2 + " = ";
        }
    }
}
