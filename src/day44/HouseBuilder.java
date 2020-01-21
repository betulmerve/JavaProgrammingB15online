package day44;

public class HouseBuilder {

    public static void main(String[] args) {

        CyberHouse c1 = new CyberHouse("Vintage", 101);
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classic", 102);
        c2.showAllInfo();

        CyberHouse.neighbourhoodName="New Haven";

        CyberHouse.showNeighbourhood();

        CyberHouse c3 = new CyberHouse("Modern", 103);
        c3.showAllInfo();


    }
}
