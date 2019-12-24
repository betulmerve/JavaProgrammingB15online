package day17;

public class FiveLittleMonkeysTask {

    public static void main(String[] args) {

        int monkeyCount=5;

        while (monkeyCount>=1) {

            System.out.println(monkeyCount+ " little monkey jumping on the bed,");
            System.out.println("One fell down and bumped his head");
            System.out.println("Mama called a doctor and the doctor said,");
            System.out.println("No more monkeys jumping in the bed!");
            --monkeyCount;
        }
    }
}
