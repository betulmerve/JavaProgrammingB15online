package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows={"Orville","Gifted","Game of Thrones",
                        "Flash","Arrow","Super girl"};

        int showsCount=shows.length;
        System.out.println("shows Count = " + showsCount);

        for (int i = 0; i <shows.length ; i++) {

//            String currentShow=shows[i];
//            System.out.println(currentShow +" has a character count "+currentShow.length());

            //cunku burda show[i] dedigimiz bir String o yuzden boyle de yapabiliriz
            System.out.println("Character count of "+ shows[i]+" is "+ shows[i].length());

        }


    }
}
