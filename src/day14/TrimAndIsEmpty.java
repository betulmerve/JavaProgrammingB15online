package day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        String message="    REPL IS COMING !    ";

        System.out.println(message);
        System.out.println("Message character count is "+message.length()); //24

        //but i dont care about space i want to get rid of space
        // trim is used to take out spice in two sides
        // NOT IN BETWEEN!
        System.out.println(message.trim());
        message=message.trim();
        System.out.println(message.length()); //16



        // just checked whether is empty or not. true or false
        System.out.println(message.isEmpty());


    }
}
