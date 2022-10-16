package org.example.tryFinnaly;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class TopLineTests {

    @Test
    void main() throws IOException {
        // String path = "src/main/resources/test.txt";
        String path = "src/test/resources/test.txt";
        String actual = TopLine.firstLieOfFile(path);
        assertThat(actual).isEqualTo("hello test world");
    }
}