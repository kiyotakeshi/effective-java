package org.example.equals.composition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class ColorPointTests {

    @Test
    void name() {
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.GREEN);
        ColorPoint colorPoint2 = new ColorPoint(1, 2, Color.RED);
        ColorPoint colorPoint3 = new ColorPoint(1, 2, Color.GREEN);

        assertThat(colorPoint).isNotEqualTo(colorPoint2);
        assertThat(colorPoint).isEqualTo(colorPoint3);
    }
}