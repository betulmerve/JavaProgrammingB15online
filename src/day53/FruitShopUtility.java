package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        // can we directly pass any object IS-A Fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless", "red", "Golden"));

        digestBetter(f1);

        Fruit f=getMyFavoriteFruit();
        System.out.println("f = " + f);
        f.getDigest();

        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(3) = " + getFavoriteByType(3));


    }

    // Create a static method called GetFavoriteByType
    // it has one int parameter
    // return favorite apple object if type is 1 , orange object if type 2

    public static Fruit getFavoriteByType(int num) {
        if (num==1) {
            return new Apple("crispy but tasteless", "hot red", "Gala");
        } else if (num==2){
            return new Orange("sour", "orange", 12);
        }
        return null;
    }

    //create a static void method called digestBetter
    //it accept a fruit as parameter type
    //and inside the method it will digest
    //the Fruit object 4 times

    public static void digestBetter(Fruit anyF) {
        anyF.getDigest();
        anyF.getDigest();
        anyF.getDigest();
        anyF.getDigest();
        System.out.println("anyF = " + anyF);

    }

    // Create a static method called getMyFavoriteFruit
    // accept no parameter and return your Favorite Fruit Object

    public static Fruit getMyFavoriteFruit() {

        System.out.print("My favourite fruit is ");
        return new Apple("sweet","red","gold");
    }


    //displayFruit

    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying fruit \n "+ anyFruit.toString() );
    }
}
