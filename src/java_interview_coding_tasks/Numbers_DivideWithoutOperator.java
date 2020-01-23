package java_interview_coding_tasks;

public class Numbers_DivideWithoutOperator {

    /*
    Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {

        dividingNumbers(10,2);
        dividingNumbers(12,6);
        dividingNumbers(20,5);
        dividingNumbers(21,5);


    }

    public static void dividingNumbers(int num1, int num2) {
        if (num2==0) {
            System.out.println("can not divide");
            return;
        }

        int count=0;

        do {
            num1=num1-num2;
            count++;
        } while(num1>=num2);

        System.out.println(count+" and remainder is "+num1);
    }
}
