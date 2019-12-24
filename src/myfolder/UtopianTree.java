package myfolder;

public class UtopianTree {

    public static void main(String[] args) {

        int treeSize=0;

        for (int x = 1; x <=3 ; x++) {

            System.out.println("Year "+x+" - growth 1 cm");
            treeSize=treeSize+1;
            System.out.println("tree size: "+treeSize+" cm");
        }

        for (int x = 4; x <=10 ; x++) {

            System.out.println("Year "+x+" - growth 2 cm");
            treeSize=treeSize+2;
            System.out.println("tree size: "+treeSize+" cm");

        }
    }
}
