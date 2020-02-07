package day54.animal;

public class AnimalShow {

    //What decide what a variable can access?
    //The reference type
    //What decide what method will actually run?
    //The actual object type

    //Dog IS-A Dog
    //Dog IS-A Animal
    //Dog IS-A Object
    //Dog IS-A IndoorPet
    public static void main(String[] args) {

        // refer a dog object as a dog
        // it can do everything a dog can do (including Animal, IndoorPet stuff)
        Dog d1=new Dog();
        d1.play();
        d1.speak();

        // refer a dog object as an animal
        // it can do only things an animal can do (speak)
        Animal a1=d1;
        a1.speak();


        // refer a dog object as an Object
        // it can do only things an Object can do (toString, hashcode)
        Object o1=d1;
        o1.toString();

        // refer a dog object as an IndoorPet
        // it can do only things an IndoorPet can do (play)
        IndoorPet p1=d1;
        p1.play();




    }
}
