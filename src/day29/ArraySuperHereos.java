package day29;

public class ArraySuperHereos {

    public static void main(String[] args) {


        String[] allHereos={"Superman-Clark Kent",
        "Batman-Bruce Wayne",
        "Wonder Woman-Princess Diana",
        "Aquaman-Arthur Orin Curry",
        "Wonder Woman-Princess Diana",
        "Cyborg-Victor Stone",
        "The Flash-Barry Allen",
        "Green Lantern-Hal Jordan",
        "Green Arrow-Oliver Queen",
        "Atom-Ray Palmer",
        "Hawkman-Carter Hall",
        "Hawkgirl-Shiera Hall",
        "Zantana-Zantana Zatara",
        "Martian Manhunter-John Jones"};

        //String hero1="Superman-Clark Kent";

        //Hero code is Superman and Identity is Clark Kent
        //The initial of the hero is CK


        for (String eachHero:allHereos) {

            String[] heroSplitted=eachHero.split("-");
            String heroCode=heroSplitted[0];
            String fullName=heroSplitted[1];

            System.out.println("Hero code is "+heroCode+" and Identity is "+fullName);

            int indexOfSpace=fullName.lastIndexOf(" ");
            System.out.println("The initial of the hero is "+fullName.charAt(0)+fullName.charAt(indexOfSpace+1));

        }


    }
}
