package org.example.hashCode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class PhoneNumberTests {

    @Test
    void name() {
        PhoneNumber phoneNumber = new PhoneNumber(801, 312, 333);
        PhoneNumber phoneNumber2 = new PhoneNumber(801, 312, 333);
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(phoneNumber, "mike");

        assertThat(m.get(phoneNumber)).isEqualTo("mike");
        assertThat(m.get(phoneNumber2)).isNull();
    }
}