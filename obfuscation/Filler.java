package obfuscation;

import java.util.Collections;

public class Filler {

    public static String process(String str) {
        if (str.length() < 24) {
            return str + String.join("", Collections.nCopies(24 - str.length(), "?"));
        }

        return str;
    }

}
