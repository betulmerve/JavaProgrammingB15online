package java_interview_coding_tasks;

public class Try_String_PasswordValidation {
    /*
    1. Write a return method that can verify if a password is valid or not.

    requirements:

     1. Password MUST be at least have 6 characters and should not contain space

    2. PassWord should at least contain one upper case letter

    3. PassWord should at least contain one lowercase letter

    4. Password should at least contain one special characters

    5. Password should at least contain a digit

    if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static void main(String[] args) {

        System.out.println(passwordValidation("abc"));
        System.out.println(passwordValidation("abcD3dfF"));
        System.out.println(passwordValidation("ab D"));
    }
    public static boolean passwordValidation(String password) {

    return true;
    }
}
