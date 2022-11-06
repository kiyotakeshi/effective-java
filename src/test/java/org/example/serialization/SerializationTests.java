package org.example.serialization;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

/**
 * {@link org.example.serialization.Person}
 *
 * @author kiyota
 */
class SerializationTests {

    @TempDir
    static File tempDir;
    private static File outputFile;

    private static File outputFile2;
    private static File outputFile3;

    @BeforeAll
    static void beforeAll() {
        outputFile = new File(tempDir, "yourfile.txt");
        outputFile2 = new File(tempDir, "yourfile2.txt");
        outputFile3 = new File(tempDir, "yourfile3.txt");
    }

    @Test
    void whenSerializingAndDeserializing_ThenObjectIsTheSame() throws IOException, ClassNotFoundException {
        var person = new Person();
        person.setName("mike");
        person.setAge(20);

        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(outputFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person deserializedPerson = (Person) objectInputStream.readObject();
        objectInputStream.close();

        assertThat(deserializedPerson.getName()).isEqualTo(person.getName());
        assertThat(deserializedPerson.getAge()).isEqualTo(person.getAge());
    }

    @Test
    public void whenCustomSerializingAndDeserializing_ThenObjectIsTheSame() throws IOException, ClassNotFoundException {
        var person = new Person();
        person.setName("mike");
        person.setAge(30);

        var address = new Address();
        address.setHouseNumber(1);

        var employee = new Employee();
        employee.setPerson(person);
        employee.setAddress(address);

        FileOutputStream fileOutputStream = new FileOutputStream(outputFile2);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employee);
            objectOutputStream.flush();
        }

        FileInputStream fileInputStream = new FileInputStream(outputFile2);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Employee deserializedEmployee = (Employee) objectInputStream.readObject();
            assertThat(deserializedEmployee.getAddress().getHouseNumber()).isEqualTo(employee.getAddress().getHouseNumber());
        }
    }

    @Test
    public void whenSerializing_ThenThrowsError() throws IOException {
        var address = new Address();
        address.setHouseNumber(10);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile3);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            assertThatThrownBy(() ->
                    objectOutputStream.writeObject(address)).isInstanceOf(NotSerializableException.class);
        }
    }
}