package day34;

public class LoginActivity {

    public static void main(String[] args) {
        /*
        1, login1 :  static void method
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whether username and password  "user" and "abc123"
	if yes
		print login successful
	else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)

		-------------------------------

		2, login2 :  static method boolean return type
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		return true
	else
		return false
         */

        loginVoid("user","abc123");
        loginVoid("usery","abc123");
        boolean result=loginReturn("user","abc123");
        System.out.println(result);
        System.out.println(loginReturn("user","abc122"));

        if (loginReturn("user","abc123")) {
            System.out.println("Add Java book to cart");
            System.out.println("Pay for the book");
            System.out.println("View the order");
        } else {
            System.out.println("No shopping, unless you sign in");
        }
    }

    public static void loginVoid(String username, String password) {

        if (username.equals("user") && password.equals("abc123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed");
        }

    }
    public static boolean loginReturn(String username, String password) {
//        if (username.equals("user") && password.equals("abc123")) {
//            return true;
//        } else {
//            return false;
//        }
        //kisaltmak istersek bu sekilde de yapabiliriz
        return username.equals("user") && password.equals("abc123");
    }
}
