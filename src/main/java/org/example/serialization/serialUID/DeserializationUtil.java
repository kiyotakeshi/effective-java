package org.example.serialization.serialUID;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

/**
 * @author kiyota
 */
public class DeserializationUtil {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String serializedMac = "rO0ABXNyADBvcmcuZXhhbXBsZS5zZXJpYWxpemF0aW9uLnNlcmlhbFVJRC5BcHBsZVByb2R1Y3QAAAAAABLWhwIAA0wADWhlYWRwaG9uZVBvcnR0ABJMamF2YS9sYW5nL1N0cmluZztMAA1saWdodG5pbmdQb3J0cQB+AAFMAA90aHVuZGVyYm9sdFBvcnRxAH4AAXhwdAARaGVhZHBob25lUG9ydDIwMjJ0ABFsaWdodG5pbmdQb3J0MjAyMnQAE3RodW5kZXJib2x0UG9ydDIwMjI=";
        System.out.println("deserializing apple product...");
        AppleProduct deserializedMac = (AppleProduct) deSerializeObjectFromString(serializedMac);
        System.out.println("HeadphonePort:" + deserializedMac.getHeadphonePort());
        System.out.println("ThunderboltPort:" + deserializedMac.getThunderboltPort());
        System.out.println("LightningPort:" + deserializedMac.getLightningPort());
    }

    public static Object deSerializeObjectFromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))){
            return ois.readObject();
        }
    }
}
