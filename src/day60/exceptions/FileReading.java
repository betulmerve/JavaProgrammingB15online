package day60.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileReading {

    public static void main(String[] args) throws IOException {

        List<String > allLines= Files.readAllLines(Paths.get("src/day60/note.txt"));
       System.out.println("allLines = " + allLines);

        for (String eachLine:allLines) {
            System.out.println(eachLine);
        }


    }
}
