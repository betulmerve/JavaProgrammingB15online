package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {

        String userName, password;
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your user name?");
        userName=scan.next();
        System.out.println("What is your password?");
        password=scan.next();

        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login successfully");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username is not correct");
        } else if(!password.equals("pass123") && userName.equals("user123") ) {
            System.out.println("Password is not correct");
        } else {
            System.out.println("Username and password are both wrong!");
        }

    }
}
