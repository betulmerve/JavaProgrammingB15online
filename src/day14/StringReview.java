package day14;

public class StringReview {

    public static void main(String[] args) {

        String str="I like Pumpkin";
        System.out.println(str.equals("pumpkin"));

        // contains:
        // whether a string exists in another string
        System.out.println("does it contains Pumpkin: ");
        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin= str.contains("Pumpkin");
        //shortcut  soutv
        System.out.println("gotPumpkin = " + gotPumpkin);

        //startsWith  endsWith
        //whether a string starts with in another string
        //whether a string ends with in another string

        boolean startedWithI=str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endsWithPumpkin=str.endsWith("Pumpkin");
        System.out.println("endsWithPumpkin = " + endsWithPumpkin);










    }
}
