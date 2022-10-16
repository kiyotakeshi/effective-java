package org.example.compareTo;

import org.junit.jupiter.api.Test;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kiyota
 */
class PhoneNumberTests {

    @Test
    void name() {
        NavigableSet<PhoneNumber> s = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            s.add(randomPhoneNumber());
        }
        System.out.println(s);
    }

    private PhoneNumber randomPhoneNumber() {
        Random random = ThreadLocalRandom.current();
        return new PhoneNumber(
                random.nextInt(999),
                random.nextInt(999),
                random.nextInt(999));
    }
}