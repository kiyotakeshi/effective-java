package org.example.methods;

/**
 * @author kiyota
 */
public class Varargs {

    // 1個以上の引数を渡す
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }
}
