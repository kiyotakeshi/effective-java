package org.example.serialization;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author kiyota
 */
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
