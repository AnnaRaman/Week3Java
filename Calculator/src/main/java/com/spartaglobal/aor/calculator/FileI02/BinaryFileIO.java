package com.spartaglobal.aor.calculator.Filel02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BinaryFileIO {
    public static void readBinaryFile(String binaryFileName) {

        try (FileInputStream in = new FileInputStream(binaryFileName))
        {
            int theByte;
            //read from the file until -1 is returned (all the rest should be positive)
            while ((theByte = in.read()) != -1) {
                System.out.print(theByte + " ");
                System.out.println(Character.toChars(theByte));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void copyBinaryFile(String binaryFileName, String outFile) {
        // try with resource - close() is called automatically on exit
        // the resources must implement the AutoCloseable interface
        try (FileInputStream in = new FileInputStream(binaryFileName);
             FileOutputStream out = new FileOutputStream(outFile))
        {
            int theByte;
            //read from the file until -1 is returned (all the rest should be positive)
            while ((theByte = in.read()) != -1) {
                theByte++;
                System.out.print(theByte + " ");
                System.out.println(Character.toChars(theByte));
                out.write(theByte);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
