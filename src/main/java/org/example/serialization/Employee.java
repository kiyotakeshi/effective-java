package org.example.serialization;

import java.io.*;

/**
 * @author kiyota
 */
public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private transient Address address;
    private Person person;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(this.address.getHouseNumber());
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        Integer houseNumber = (Integer) ois.readObject();
        var deserializedAddress = new Address();
        deserializedAddress.setHouseNumber(houseNumber);
        this.setAddress(deserializedAddress);
    }
}
