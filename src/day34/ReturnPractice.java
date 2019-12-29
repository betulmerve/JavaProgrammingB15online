package day34;

public class ReturnPractice {

    public static void main(String[] args) {

        //what is return keyword is used?
        //

        //break VS return
        //break --> loop:break out of the loop
        //          switch: break out of the case
        //          can we used it to exit method? NOOOO!
        //return --> inside a method
        //return the value out of a method with return type
        //the moment the return keyword is reached it will terminate the method
        //can it be used in void method?
        // yes but only in this way --> return;
        //what is the benefit of using in void method?
        //to terminate the method early
    }

    public static void printMin4CharLengthName(String name) {
        if (name.length()<4) {
            System.out.println("Invalid name!");
            return; //this return is being used get out the method early
        }
        System.out.println(name);
    }
}
