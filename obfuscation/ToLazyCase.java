package obfuscation;

public class ToLazyCase {

    public static String process(final String str) {
        return str.substring(0, str.length() / 2) + str.substring(str.length() / 2).toLowerCase();
    }

}
