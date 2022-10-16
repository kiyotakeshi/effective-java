package org.example.tryWithResource;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
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

        String actual;
        try(BufferedReader br = new BufferedReader(new FileReader(dst))){
            actual = br.readLine();
        }
        assertThat(actual).isEqualTo("hello test world");
    }
}