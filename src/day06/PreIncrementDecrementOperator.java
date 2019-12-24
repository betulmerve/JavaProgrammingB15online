package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount=2;

        // eger arti 1 yapmak istersen bu uc sekilde yapabilirsin, sadece kisaltmak icin farki yok
        // ayni sekilde eksi 1 de bu sekilde yapabilirsin

        offerCount=offerCount+1;

        offerCount+=1;

        ++offerCount;

        System.out.println(offerCount);

        offerCount=offerCount-1;
        offerCount-=1;
        --offerCount;

        System.out.println(offerCount);
    }
}
