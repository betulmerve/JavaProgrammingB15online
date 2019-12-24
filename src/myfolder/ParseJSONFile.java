package myfolder;

import java.util.Scanner;

public class ParseJSONFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        /*
        Example:
        //    012345678901234567890123456789012
        input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
        output:
        First name: James
        Last name: May
         */

        int firstNameIndex=0;
        int lastNameIndex=0;
        int indexOfQuote1=0;
        int indexOfQuote2=0;

        for (int i = 0; i <=json.length()-14 ; i++) {

            if (json.substring(i,i+14).equalsIgnoreCase("\"firstName\": \"")) {
                firstNameIndex=i;

                for (int j = i+15; j <=json.length()-1 ; j++) {

                    if(json.substring(j,j+1).equals("\"")) {
                        indexOfQuote1=j;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i <=json.length()-13 ; i++) {

            if (json.substring(i,i+13).equalsIgnoreCase("\"lastName\": \"")) {
                lastNameIndex=i;

                for (int j = i+15; j <=json.length()-1 ; j++) {

                    if(json.substring(j,j+1).equals("\"")) {
                        indexOfQuote2=j;
                        break;
                    }
                }
            }
        }
        System.out.println("First name: "+json.substring(firstNameIndex+14,indexOfQuote1));
        System.out.println("Last name: "+json.substring(lastNameIndex+13,indexOfQuote2));

    }
}
