package day50;

public class Addition extends Question{



    public Addition( int num1, int num2) {
        super("+","addition");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {
        answer=num1+num2;
        this.calculated=true;
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
