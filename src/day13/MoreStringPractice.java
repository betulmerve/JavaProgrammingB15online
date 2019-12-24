package day13;

public class MoreStringPractice {

    public static void main(String[] args) {

//        String name="Ankar";
//        System.out.println(name);
//        name="Bulent";
//        System.out.println(name);


        String name="Pumpkin";
        System.out.println(name);

        name.toUpperCase();
        System.out.println(name);  //cunku yukarida sadece girdik, point etmedik, degistirmedik
        System.out.println(name.toUpperCase());

        name= name.toUpperCase(); //burda degistirdik. yani yine yeni olusturduk ama aradaki bagi kopardik yeni bag
        System.out.println(name);

        //Stringle ilgili action aldiginda EVERYTIME yeni bir String olusturuluyor
        // this is String is immutable!
        //sonrasinda pointer olmayan boslukta olanlar garbage atiliyor
        //yani sonunda tek pumpkin kalacak diger ucu cope gidecek



    }
}
