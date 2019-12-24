package day11;

public class WarmUpTask2_LightOn_Char {

    public static void main(String[] args) {

        char targetOption='B';
//        String Bd="Bedroom";
//        String Lr="Living room";
//        String Ki="Kitchen";
//        String Hw="Hallway";


        switch (targetOption) {
            case 'B' :
                System.out.println("You have turned on bedroom light");
                break;
            case 'L':
                System.out.println("You have turned on living room light");
                break;
            case 'K':
                System.out.println("You have turned on kitchen light");
                break;
            case 'H':
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("There is no switch like that!");



        }


    }
}
