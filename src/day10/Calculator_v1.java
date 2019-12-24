package day10;

public class Calculator_v1 {

    public static void main(String[] args) {

        char operator = '/';


        switch (operator) {
            case '+':
                System.out.println("You are about the add numbers");
                break;
            case '-':
                System.out.println("You are about the subtract numbers");
                break;
            case '*':
                System.out.println("You are about the multiply numbers");
                break;
            case '/':
                System.out.println("You are about the divide numbers");
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
