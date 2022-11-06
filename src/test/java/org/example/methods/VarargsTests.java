package org.example.methods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class VarargsTests {
    @Test
    void name() {
        assertThat(Varargs.min(1, 2, 3, 4, 5, 6))
                .isEqualTo(1);
    }
}