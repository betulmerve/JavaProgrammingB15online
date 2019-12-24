package day22;

public class StringArray {

    public static void main(String[] args) {

        //create a String array
        //name of your household member


        String[] householdMember=new String[3];

        householdMember[0]="Ali";
        householdMember[1]="Merve";
        householdMember[2]="Bilal";

        System.out.println(householdMember[0]);
        System.out.println(householdMember[1]);
        System.out.println(householdMember[2]);

        //array in sizeini degistiremiyoruz hic bir zaman
        //fakat icerigini degistirebiliyoruz
        //yani string gibi degil, string immutable yani degismez, yenisi olustururlur
        //fakat arrayde icerigi degistirebilirsin not immutable

    }
}
