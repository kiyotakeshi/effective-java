package org.example.hashCode;

import java.util.Objects;

/**
 * @author kiyota
 */
public class PhoneNumber {
    private final int areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 999, "line num");
    }

    private static int rangeCheck(int areaCode, int max, String arg) {
        if(areaCode < 0 || areaCode > max){
            throw new IllegalArgumentException(arg + ": " + areaCode);
        }
        return areaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, prefix, lineNum);
//    }
}
