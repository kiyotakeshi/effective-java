package org.example.serialization.serialUID;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

/**
 * @author kiyota
 */
public class SerializationUtil {

    public static void main(String[] args) throws IOException {
        var mac = new AppleProduct();
        mac.setHeadphonePort("headphonePort2022");
        mac.setThunderboltPort("thunderboltPort2022");
        mac.setLightningPort("lightningPort2022");

        String serializedMac = serializeObjectToString(mac);
        System.out.println("serialized apple product to string:");
        System.out.println(serializedMac);

    }

    public static String serializeObjectToString(Serializable o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(baos)){
            oos.writeObject(o);
        }
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }
}
