package org.example.tryWithResource;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author kiyota
 */
class TopLineTests {

    @Test
    void name() throws IOException {
        String path = "src/test/resources/test.txt";
        String actual = TopLine.firstLineOfFile(path);
        assertThat(actual).isEqualTo("hello test world");
    }

    @Test
    void defaultValue(){
        String path = "src/test/resources/not_exists_path/test.txt";
        String defaultValue = "non";
        String actual = TopLine.firstLineOfFileWithDefault(path, defaultValue);
        assertThat(actual).isEqualTo(defaultValue);
    }
}