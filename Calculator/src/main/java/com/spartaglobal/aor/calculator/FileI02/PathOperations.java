package com.spartaglobal.aor.calculator.Filel02;

import java.io.File;
import java.io.IOException;
public class PathOperations {
    public static void tryPathOps() throws IOException {
        File file = new File("TestDoc.file");
        boolean success = false;
        if (!file.exists()){
            success = file.createNewFile();
        }
        System.out.println("File created " + success);
    }
}