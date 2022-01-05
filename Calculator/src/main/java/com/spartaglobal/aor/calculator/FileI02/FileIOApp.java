package com.spartaglobal.aor.calculator.Filel02;

import java.io.IOException;
public class FileIOApp {
    public static void main(String[] args) {
        BinaryFileIO.readBinaryFile("/Users/annaraman/Documents/Sparta Global/Week 4/Week3Java/Calculator/LoremIpsum.txt");
        BinaryFileIO.copyBinaryFile("/Users/annaraman/Documents/Sparta Global/Week 4/Week3Java/Calculator/LoremIpsum.txt", "output.txt");
        TextFileIO.copyTextFile("/Users/annaraman/Documents/Sparta Global/Week 4/Week3Java/Calculator/LoremIpsum.txt", "output.txt");
        TextFileIO.copyAndSplitTextFile("/Users/annaraman/Documents/Sparta Global/Week 4/Week3Java/Calculator/LoremIpsum.txt", "output.txt");
        try {
            PathOperations.tryPathOps();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
