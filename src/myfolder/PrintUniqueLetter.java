package myfolder;

public class PrintUniqueLetter {

    public static void main(String[] args) {


        String[] array = {"A","A","B","C", "C", "D", "E"};

        for (int x = 0; x <=array.length-1 ; x++) {
            int count=0;
            for (int y = 0; y <=array.length-1 ; y++) {

                if (array[x].equals(array[y])) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(array[x]);
            }
        }
    }
}
