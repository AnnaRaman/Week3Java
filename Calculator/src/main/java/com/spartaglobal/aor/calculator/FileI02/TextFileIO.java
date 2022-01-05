package com.spartaglobal.aor.calculator.Filel02;

import java.io.*;
public class TextFileIO {
    public static void copyTextFile(String textFileName, String outTextFile) {
        // try with resource - close() is called automatically on exit
        // the resources must implement the AutoCloseable interface
        try (BufferedReader in = new BufferedReader(new FileReader(textFileName));
             BufferedWriter out = new BufferedWriter(new FileWriter(outTextFile)))
        {
            String lineOfText;
            //read from the file until -1 is returned (all the rest should be positive)
            while ((lineOfText = in.readLine()) != null) {
                System.out.print(lineOfText + " ");
                out.write(lineOfText + "\n\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void copyAndSplitTextFile(String textFileName, String outSplitTextFile) {
        // try with resource - close() is called automatically on exit
        // the resources must implement the AutoCloseable interface
        try (BufferedReader in = new BufferedReader(new FileReader(textFileName));
             BufferedWriter out = new BufferedWriter(new FileWriter(outSplitTextFile)))
        {
            String lineOfText;
            //read from the file until -1 is returned (all the rest should be positive)
            while ((lineOfText = in.readLine()) != null) {
                System.out.print(lineOfText + " ");
                String[] words = lineOfText.split(" ");
                for (var word : words) {
                    System.out.println(word);
                    out.write(word + "\n");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}

