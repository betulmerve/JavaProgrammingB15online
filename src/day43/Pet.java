package day43;

public class Pet {

    private String breed;
    private String name;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Pet() {
        this.breed="unknown";
        this.name="no name";
    }
    public Pet(String breed,String name){
        this.breed=breed;
        this.name=name;
    }

    public void speak() {

        //switch kullansam daha kolay olurdu
        if (breed.equalsIgnoreCase("cat")) {
            System.out.println("meow");
        } else if (breed.equalsIgnoreCase("dog")) {
            System.out.println("woof");
        } else if (breed.equalsIgnoreCase("cow")){
            System.out.println("mooo");
        } else if (breed.equalsIgnoreCase("horse")) {
            System.out.println("neinei");
        } else {
            System.out.println("Unknown animal!");
        }
    }

    // IF YOUR METHOD DOES NOT READ OR MODIFY OBJECT ATTRINUTE
    // YOU CAN JUST MAKE IT STATIC
    public static void showGeneralPetInfo() {
        System.out.println("PETS ARE FRIEND OF HUMANS");
        // THIS WILL NOT WORK
        // STATIC METHOD CAN NOT ACCESS ANYTHING NON-STATIC
        //System.out.println(name);
    }
}
