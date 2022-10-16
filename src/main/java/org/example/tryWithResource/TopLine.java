package org.example.tryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kiyota
 */
public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }
    static String firstLineOfFileWithDefault(String path, String defaultVal) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
