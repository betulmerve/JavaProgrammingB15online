package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        for(int i=0; i<=100; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();

        //skip counting by 3

        for (int x=0; x<=100; x+=3) {
            System.out.print(x+" ");
        }
        System.out.println();

        for (int y=0; y<=100; y+=5) {
            System.out.print(y+" ");
        }

        System.out.println();

        //fori olarak shortcut var!
        for (int i = 0; i <100 ; i++) {

            if (i%2==0) {
                System.out.print(i+ " ");
            }
        }


        for (int i = 0; i <100 ; i++) {
            if (i%5==0 && i%3==0) {
                System.out.println(i+" is FizzBuzzNumber");
            } else if(i%5==0) {
                System.out.println(i+" is Fizz Number");
            } else if(i%3==0) {
                System.out.println(i+ " is Buzz Number");
            }

        }

        //everything you can do with the for loop--->> can be done using while loop!!
    }
}
