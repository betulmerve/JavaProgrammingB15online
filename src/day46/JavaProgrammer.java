package day46;

// JavaProgrammer
// unique behaviour : drinkCoffee , doRepl , doJavaDevelopment
public class JavaProgrammer extends Programmer {

    @Override
    void code() {
        super.code();
        System.out.println("I code Java!");
    }

    @Override
    void test() {
        super.test();
        System.out.println("We do test in JUnit1!");
    }

    void drinkCoffee() {
        System.out.println("Java programmers drink  lots of coffee");
    }

    void doJavaDevelopment() {
        System.out.println("Java programmer do Java development");
    }
}
