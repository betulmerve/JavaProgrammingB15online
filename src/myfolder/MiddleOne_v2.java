package myfolder;

import java.util.Scanner;

public class MiddleOne_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.equalsIgnoreCase(end)) {
            System.out.println(end + " found");
        } else {
            String directions = "A right B down C left D up A right B down C";
            int indexStart = directions.indexOf(start);
            int indexEnd;

            if (start.charAt(0) < end.charAt(0)) {
                indexEnd = directions.indexOf(end);
            } else {
                indexEnd = directions.lastIndexOf(end); //will check backwards
            }

            String route = directions.substring(indexStart + 2, indexEnd - 1);
            route = route.replace('A', '>'); //will ignore if A is not present
            route = route.replace('B', '>');
            route = route.replace('C', '>');
            route = route.replace('D', '>');

            System.out.println(route + ": " + end + " found");
        }






















    }
}
