package day09;

public class DayPrinter_WithSwitchStatement {

    public static void main(String[] args) {

        int dayCode=5;

        switch (dayCode) {
            case 1:
                System.out.println("It is Monday");
                break; //used to get out of this branch
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Day is unknown");
        }

    }
}
