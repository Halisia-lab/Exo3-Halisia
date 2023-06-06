package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    static List<String> readLines() {
        List<String> linesString = new ArrayList<>();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("calc.txt"));
            String line = reader.readLine();

            while (line != null) {
                linesString.add(line);
                System.out.println(line);
                // read next line
                line = reader.readLine();

            }
return linesString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
