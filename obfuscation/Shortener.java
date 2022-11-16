package obfuscation;

public class Shortener {

    public static String process(final String str) {
        if (str.length() > 32) {
            return str.substring(0, 32);
        }

        return str;
    }

}
