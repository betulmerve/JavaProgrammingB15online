package day44;

public class CyberHouse {

    int houseNum;
    String design;

    // we can change default value of the fields
    // by assigning value directly in the template class
    static String neighbourhoodName="Cybertek Avenue";

    // constructor  can access anything
    public CyberHouse(String design,int houseNum ) {
        this.houseNum=houseNum;
        this.design=design;

    }

    // instance method can access anything
    public void showAllInfo() {
        System.out.println("house number is: "+houseNum+" design of a house is :" +design+" the neighbourhood name is: "+
                neighbourhoodName);
    }

    // static method can only access static members of same class
    public static void showNeighbourhood() {
        System.out.println("the neighbourhood is: "+neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        //System.out.println("houseNum = " + houseNum);
    }

}
