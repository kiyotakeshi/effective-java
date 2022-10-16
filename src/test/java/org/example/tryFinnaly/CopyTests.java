package org.example.tryFinnaly;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class CopyTests {

    @Test
    void name() throws IOException {
        String src = "src/test/resources/test.txt";
        String dst = "src/test/resources/copy/test.txt";
        Copy.copy(src, dst);
    }
}