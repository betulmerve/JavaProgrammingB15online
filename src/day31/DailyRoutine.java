package day31;

public class DailyRoutine {

    public static void wakeUp() {
        System.out.println("Open your eye");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again");
        System.out.println("-----------------");
    }

    public static void drinkCoffee() {
        System.out.println("Put coffee in your machine");
        System.out.println("Make your coffee");
        System.out.println("-----------------");
    }

    public static void prepareKidsForSchool() {
        System.out.println("Wake them up for ten times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println("-----------------");
    }

    public static void takeThemToSchool() {
        System.out.println("Take them to school bus");
        System.out.println("Say goodbye");
        System.out.println("-----------------");
    }

    public static void studyJava() {
        System.out.println("Think about Java waking up");
        System.out.println("Think about Java drinking coffee");
        System.out.println("Think about Java taking them to school");
        System.out.println("sit down and study Java");
        System.out.println("-------------------");
    }

    public static void sayILoveJava300Times() {
        for (int x = 1; x <=300 ; x++) {
            System.out.print("I Love Java | ");

        }
        System.out.println();
    }

    public static void main(String[] args) {

        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();

        /*
        wake up
        drink coffee
        prepare kids for school
        take them to school
        go to work
        groceryshopping
        cooking
        study
        go to sleep
         */
    }
}
