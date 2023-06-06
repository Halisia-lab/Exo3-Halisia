package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> fileLines = FileParser.readLines();
        OutputWriter outputWriter = new OutputWriter(fileLines);
        outputWriter.writeInConsole();
    }
}
