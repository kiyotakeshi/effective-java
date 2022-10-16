package org.example.tryFinnaly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kiyota
 */
public class TopLine {
    static String firstLieOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }
}
