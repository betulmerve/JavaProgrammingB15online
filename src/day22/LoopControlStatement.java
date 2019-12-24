package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg="I struggle with Java I like Java I love Java everything is awesome!";

        //Task 1

//        for (int i = 0; i <=msg.length()-1 ; i++) {
//
//            if(i%2==1) {
//                continue;
//            } else {
//                System.out.print(msg.substring(i,i+1));
//            }
//        }

        //Task 2

//
//        for (int i = 0; i <=msg.length()-1 ; i++) {
//
//            if(msg.substring(i,i+1).equalsIgnoreCase("a")) {
//                break;
//            }
//            System.out.print(msg.substring(i,i+1));
//
//        }

        //Task 1 and Task 2 combined
//        for (int i = 0; i <= msg.length() - 1; i++) {
//
//            if (i % 2 == 1) {
//                continue;
//            } else if (msg.substring(i, i + 1).equalsIgnoreCase("J")) {
//                break;
//            } else {
//                System.out.print(msg.substring(i,i+1));
//            }
//        }

        //Task 3
        int counter=0;
        for (int i = 0; i <=msg.length()-1 ; i++) {

            if(msg.substring(i,i+1).equalsIgnoreCase("a")) {
                counter++;
            }
            if(counter==3) {
                break;
            }
            System.out.print(msg.substring(i,i+1));
        }



    }
}
