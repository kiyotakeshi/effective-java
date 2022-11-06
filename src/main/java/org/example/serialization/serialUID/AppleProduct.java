package org.example.serialization.serialUID;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author kiyota
 */
public class AppleProduct implements Serializable {

    @Serial
    private static final long serialVersionUID = 1234567L; // user-defined (i.e. not default or generated)
//    private static final long serialVersionUID = 1234568L; // user-defined (i.e. not default or generated)

    // serialVersionsUID を定義しなかったら自動で採番される
    // attribute を追加したら serialVersionsUID が変わるため serialize に失敗する
    // > Exception in thread "main" java.io.InvalidClassException: org.example.serialization.serialUID.AppleProduct;
    // > local class incompatible: stream classdesc serialVersionUID = -1743291657771830498, local class serialVersionUID = 8786890119058966419
    // private String unusedAttributeForSerializeFailure;

    private String headphonePort;

    private String thunderboltPort;

    private String lightningPort;

    public String getHeadphonePort() {
        return headphonePort;
    }

    public void setHeadphonePort(String headphonePort) {
        this.headphonePort = headphonePort;
    }

    public String getThunderboltPort() {
        return thunderboltPort;
    }

    public void setThunderboltPort(String thunderboltPort) {
        this.thunderboltPort = thunderboltPort;
    }

    public String getLightningPort() {
        return lightningPort;
    }

    public void setLightningPort(String lightningPort) {
        this.lightningPort = lightningPort;
    }
}
