package day16;

public class Count1To10_v2 {

    public static void main(String[] args) {

//        int counter=1;
//
//        while (counter<=10) {
//
//            //bu sekilde yaptiginda 2-11 arasini basiyor cunku oncesinde artiriyorsun basiyorsun
//            // eger 1 yerinde 0dan baslarsan 1-11 arasini basar
//            System.out.println(++counter);
//
//            //bu sekilde yapinca 1-10 arasini basiyor cunku sonrasinda artiriyor
//            //System.out.println(counter++);
//        }

            //bu sekilde de yapabiliriz daha kisa ve mantikli
        int counter=0;

        while (++counter <11) {
            System.out.println(counter);
        }
//
//        int counter=1;
//
//        while (counter++<10) {   //bu an belki 1 olarak basliyor ama alt satirda basildigi zaman next time oldugu icin 2 oluyor
//            System.out.println(counter);
//        }






    }
}
