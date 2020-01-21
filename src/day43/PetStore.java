package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {

        Pet p1=new Pet("cat","mirnav");
        Pet p2=new Pet("dog","karabas");
        Pet p3=new Pet("cow","sarikiz");
        Pet p4=new Pet("horse","ruzgar");
        Pet p5=new Pet("snake","tistis");
        Pet p6=new Pet("cat","boncuk");
        Pet p7=new Pet("cat","mico");
        Pet p8=new Pet("dog","comar");

        Pet.showGeneralPetInfo();

        p1.speak();
        p5.speak();

        List<Pet> petList=new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
        System.out.println("petList = " + petList);

        System.out.println("name printed: ");
        for (Pet each:petList) {

            System.out.println(each.getName());

        }

        System.out.println("cats printed: ");
        for (Pet each:petList) {

            if (each.getBreed().equalsIgnoreCase("cat")) {
                System.out.println("Cat name is: "+ each.getName());
            }

        }




    }
}
