package day11;

public class WarmUpTask1_LightOnOff {

    public static void main(String[] args) {

        String targetOption="Bd";
//        String Bd="Bedroom";
//        String Lr="Living room";
//        String Ki="Kitchen";
//        String Hw="Hallway";


        switch (targetOption) {
            case "Bd" :
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on living room light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Hw":
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("There is no switch like that!");



        }


    }
}
