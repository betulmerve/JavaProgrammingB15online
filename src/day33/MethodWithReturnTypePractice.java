package day33;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(10));
        System.out.println(build_GOT_Email("Bilal","Cakir"));



        //given 1 parameter fullName
        //generate GOT_email

        String fullName="Susan Cure";
        int indexOfSpace=fullName.indexOf(" ");
        //store this resulting email
        String herEmail=build_GOT_Email(fullName.substring(0,indexOfSpace),fullName.substring(indexOfSpace+1));
        System.out.println(herEmail);

        //ya da soyle yapabiliriz
//        String part1=fullName.split(" ")[0];
//        String part2=fullName.split(" ")[1];
//        String herEmail2=build_GOT_Email(part1,part2);

        String[] fullNameSplit=fullName.split(" ");
        String herEmail2=build_GOT_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println(herEmail2);
    }
    //getSumFrom1ToX
    //this method should calculate sum of the numbers
    //from 1 to user passed number
    //including X itself
    //x final number to be added
    //return sum of numbers from 1 to x as int

    //build_GOT_Email
    //this method should build email using users full name
    //for example Jon Snow --> JSnow@nigthwatch.com
    //parameter firstName user's first name
    //          lastName user's last name
    //return first name initial + lastname+ nigthwatch.com


    public static int getSumFrom1ToX(int num) {
        int sum=0;
        for (int i = 1; i <num ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static String build_GOT_Email(String firstName,String lastName){

        return firstName.charAt(0)+lastName+"@NightWatch.com";

    }


}
